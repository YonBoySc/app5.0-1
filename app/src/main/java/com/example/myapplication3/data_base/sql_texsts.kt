package com.example.myapplication3

const val CREATE_TABLE_QUESTION = "" +
    "CREATE TABLE question (\n" +
    "    id int PRIMARY KEY,\n" +
    "    question text NOT NULL,\n" +
    "    answer text,\n" +
    "    is_test bool\n" +
    ");"

const val CREATE_TABLE_NODE = "" +
    "CREATE TABLE IF NOT EXISTS node (\n" +
    "    question_id int NOT NULL REFERENCES question (id),\n" +
    "    sub_question_id int NOT NULL REFERENCES question (id),\n" +
    "    PRIMARY KEY (question_id, sub_question_id)\n" +
    ");"

const val FILL_QUESTION = "" +
    "INSERT INTO question (id, question, answer, is_test)\n" +
    "VALUES (1, 'ДТП на машине', '', 0),\n" +
    "       (2, 'ДТП на самокате', '', 0),\n" +
    "       (3, 'ПДД для машины', '', 0),\n" +
    "       (4, 'ПДД для самоката', '', 0),\n" +
    "       (5, 'Общение с инспектором', '1. Оставайтесь спокойными. Инспектор ГИБДД – такой же человек, как и Вы, со своими мыслями и чувствами, способный ошибаться. Воздержитесь от грубости, хамства и будьте вежливыми;\\n\\n2. Приготовьте все необходимые документы:\\n\\nа) Права;\\n\\nб) Регистрацию на машину (а если едете с прицепом – то и на прицеп);\\n\\nв) Паспорт,\\n\\nи убедитесь, что в них не вложено ничего лишнего;\\n\\n3. Отстаивайте свои права и интересы, если считаете, что они нарушены, но помните о корректности;\\n\\n4. Отвечайте кратко, чётко и по делу. Воздержитесь от шуток;\\n\\n5. Не выходите из машины, если инспектор Вас об этом не просил.\\n\\n*См п. 2.1.1. ПДД, п. 2) ч. 1 ст. 13 ФЗ «О полиции»\\n', 0),\n" +
        "       (6, 'Кикшеринг', '', 0),\n" +
        "       (11, 'Базовая инструкция: что делать, если попал в ДТП?', '0. Сохраняйте спокойствие. ДТП может случиться с каждым, даже с " +
        "самым добросовестным водителем, и в такой ситуации постарайтесь успокоиться, трезво собраться с мыслями и " +
        "оставаться хладнокровными.\n\n1. Остановите машину сразу же и надежно зафиксируйте её стояночным тормозом, " +
        "а если его нет – всем, чем получится;\n\n2. Включите аварийную сигнализацию и выставьте знак аварийной остановки. " +
        "Знак выставляйте на 15 м и более в городе/в деревне/в селе/в других населённых пунктах, а вне города и т.д. - " +
        "на 30 м и более. На дороге будьте осторожны;\n\n3. Если место ДТП обширное, постарайтесь отграничить и обозначить " +
        "его всеми имеющимися предметами;\n\n4. Наденьте светоотражающую одежду, если ДТП случилось вне города ночью или при " +
        "ограниченной видимости (в тумане, например). Рекомендуется и в городе ночью надеть светоотражающую одежду;\n\n5. " +
        "Ничего не трогайте и не перемещайте, хотя бы до того, как снимете на фото или видео место происшествия, если нужно " +
        "убрать машины с дороги. Если есть пострадавшие – помогите им;\n\n6. Обязательно сфотографируйте или запишите на " +
        "видео место ДТП и всё, что к нему относится: расположение разбитых машин, их повреждения, следы и прочие предметы;\n\n7. " +
        "После фиксации всех фактов ДТП освободите дорогу, если мешаете другим машинам, и вызовите ГИБДД " +
        "по номеру 102 и скорую помощь, если это требуется.;\n\n8. После завершения всех необходимых процедур в Вашей ситуации " +
        "известите страховую компанию, выдавшую Вам полис ОСАГО (а при наличии – и компанию, выдавшую полис каско) о " +
        "произошедшем.\n\n*См. п. 2.5.-2.6.1 ПДД\n', 0),\n" +
    "       (-2, 'Как общаться с инспектором?', '1. Оставайтесь спокойными. Инспектор <a href=\"myappscheme://stack\">ГИБДД</a> – такой же человек, как и Вы, со своими мыслями и чувствами, способный ошибаться. Воздержитесь от грубости, хамства и будьте вежливыми;\n\n2. Приготовьте все необходимые документы:\n\nа) Права;\n\nб) Регистрацию на машину (а если едете с прицепом – то и на прицеп);\n\nв) Паспорт,\n\nи убедитесь, что в них не вложено ничего лишнего;\n\n3. Отстаивайте свои права и интересы, если считаете, что они нарушены, но помните о корректности;\n\n4. Отвечайте кратко, чётко и по делу. Воздержитесь от шуток;\n\n5. Не выходите из машины, если инспектор Вас об этом не просил.\n\n*См п. 2.1.1. ПДД, п. 2) ч. 1 ст. 13 ФЗ «О полиции»\n', 0),\n" +
    "       (21, 'Что делать, если попал в ДТП?', '', 0),\n" +
    "       (12, 'Я попал в ДТП с другим транспортным средством', '', 0),\n" +
    "       (13, 'Я попал в ДТП с самокатом', '1. Для начала последуйте базовым указаниям по поведению в первые минуты ДТП;\n\n2. " +
        "Постарайтесь узнать у самокатчика параметры его самоката: мощность и максимальную скорость. После этого пройдите тест, чтобы определить, кем является самокатчик в Вашей ситуации и как дальше выстроить линию Вашего поведения.\n', 0),\n" +
        "       (131, 'Тест: как определить, каким ТС считается самокат?', '', 1),\n" +
        "       (132, 'Самокатчик считается пешеходом.', '', 0),\n" +
        "       (133, 'Самокатчик считается водителем велосипеда/мопеда/мотоцикла', '', 0),\n" +
        "       (134, 'Самокатчик не хочет говорить', 'В таком случае осмотрите самокат. Если на нём есть электродвигатель, то это – электросамокат, а значит, самокатчик на нём будет являться водителем, а не пешеходом.', 0),\n" +
        "       (1331, 'Я – виновник, что мне делать?', '1. Следуйте базовым указаниям по поведению в первые минуты после ДТП;\n" +
        "2. Постарайтесь договориться с потерпевшим. Это лучший выход для Вас. Иначе Вы рискуете оказаться вовлечённым в череду претензий и судов с потерпевшим и, скорее всего, проиграете дело;\n" +
        "3. Если удалось договориться – составьте расписку об отсутствии претензий. Вы должны сойтись в том, каковы обстоятельства аварии, указать паспортные и контактные данные виновника и пострадавшего, номера машин, кто виноват, сколько он должен заплатить и когда. В расписке должны быть подписи как участников ДТП, так и 2 свидетелей;\n" +
        "4. Если договориться не удалось – пытайтесь договориться, хотя бы по любому вопросу или моменту;\n" +
        "5. Не уезжайте с места ДТП, если нет крайней необходимости (например, доставить пострадавших в больницу). Вы рискуете получить штраф или лишиться прав в соответствии со ст. 12.27 КоАП РФ.\n', 0),\n" +
        "       (1332, 'Я потерпевший, что делать?', '', 0),\n" +
        "       (14, 'Я попал в ДТП с пешеходом', '', 0),\n" +
        "       (16, 'Могу ли я уехать с места ДТП?', '', 0),\n" +
        "       (17, 'Когда можно составить Европротокол?', 'Убедитесь, что:\n\n1. В ДТП нет потерпевших;\n\n2. В ДТП участвуют только два ТС;\n\n3. Повреждения получили только участвовавшие в ДТП автомобили;\n\n4. И Вы, и второй водитель вписаны в действующие полисы ОСАГО или международный полис «Зеленая карта», выданные на участвующие в ДТП автомобили;\n\n5. По предварительной оценке нанесенный ТС ущерб не превышает максимальную сумму страховой выплаты;\n\n6. Вы и второй водитель согласны оформить ДТП без вызова сотрудников ГИБДД и подписать Европротокол.\n\nЕсли вы не уверены в обстоятельствах аварии, оценке нанесенного ущерба, конструктивном настрое второго участника ДТП, то оформляйте аварию в обычном порядке.\n\nУчтите, что за просрочку полиса ОСАГО Вам могут назначить штраф в 500 рублей, а за отсутствие полиса в принципе – штраф 800 рублей.\n\n*См. ст. 11.1 ФЗ «Об ОСАГО», ст. 12.37 КоАП РФ, п. 2.6.1. ПДД\n\n', 0),\n" +
        "       (18, 'Как оформляется ДТП?', '', 0),\n" +
        "       (19, 'Когда можно не вызывать ГИБДД?', '', 0),\n" +
        "       (-21, 'Что должно быть отражено в протоколе?', 'Проверьте, отражены ли в протоколе:\n\n1. Дата и место составления;\n\n2. Должность, фамилия и инициалы инспектора;\n\n3. Сведения о Вас;\n\n4. ФИО и адреса свидетелей (если есть);\n\n5. Место, время составления и насчёт чего составлен протокол;\n\n6. Ссылка на Закон РФ/Закон Вашего региона (должен быть указан п. 3.1. ст. 12.5. КоАП РФ);\n\n7. Ваши объяснения;\n\n8. Стоит ли запись насчёт того, что Вам разъяснили Ваши права и обязанности.\n\nВ отношении Вас может быть составлен ТОЛЬКО 1 протокол. Вам должны вручить копию протокола под Вашу расписку.\n\nТакже учтите, что в протоколе должны быть отражены показания радара/тауметра, если Вы превысили скорость/слишком затонировали стёкла.\n\n*См. ст. 28.2 КоАП РФ\n', 0),\n" +
    "       (-22, 'Можно ли записывать на видео действия сотрудника?', 'Да, вполне. Ничто не запрещает Вам это сделать. Только убедитесь, что Вы не находитесь рядом с режимным или секретным объектом, не мешаете другим людям, инспектору при ДТП или при оперативных действиях.\n\n*См. ч. 4 ст. 29 Конституции РФ, ст. 26.2 КоАП РФ\n', 0),\n" +
    "       (-23, 'Можно ли решить вопрос на месте, заплатив инспектору деньги?', 'Такое «простое решение» проблемы ничем хорошим не кончится: инспекторы ГИБДД задержат Вас, в протоколе обязательно отразят Вашу попытку дать им взятку и подадут уведомление, в котором известят начальство о Ваших действиях. А это уже будет грозить уголовной ответственностью Вам. Лучше воздержитесь от такого способа решить ситуацию.\n\n* ст. 291 УК РФ\n', 0),\n" +
    "       (-24, 'Могу ли я участвовать в составлении протокола?', '', 0),\n" +
    "       (-25, 'Что делать, если инспектор нарушает мои права?', '', 0),\n" +
    "       (-26, 'Что делать, если инспектор отказался составлять протокол?', '', 0),\n" +
    "       (211, 'Вы считаетесь пешеходом', '', 0),\n" +
    "       (212, 'Ваш самокат считается велосипедом/мопедом/мотоциклом', '', 0),\n" +
    "       (213, 'Тест: как определить, каким ТС считается ваш самокат?', 'Тут будет тест\n', 1),\n" +
    "       (1121, 'Он является пешеходом', '', 0),\n" +
    "       (1122, 'Он является водителем', '', 0),\n" +
    "       (1123, 'Водитель самоката не хочет говорить', 'Осмотрите самокат. Если на нём есть электродвигатель, то это – электросамокат, а значит, самокатчик на нём будет являться водителем, а не пешеходом.\n', 0),\n" +
    "       (1124, 'Тест', 'Тут будет тест\n', 1),\n" +
    "       (11221, 'Я виновник, что мне делать?', '1. Следуйте базовым указаниям по поведению в первые минуты после ДТП;\n\n2. Постарайтесь договориться с потерпевшим. Это лучший выход для Вас. Иначе Вы рискуете оказаться вовлечённым в череду претензий и судов с потерпевшим и, скорее всего, проиграете дело;\n\n3. Если удалось договориться – составьте расписку об отсутствии претензий. Вы должны сойтись в том, каковы обстоятельства аварии, указать паспортные и контактные данные виновника и пострадавшего, номера машин, кто виноват, сколько он должен заплатить и когда. В расписке должны быть подписи как участников ДТП, так и 2 свидетелей;\n\n4. Если договориться не удалось – пытайтесь договориться, хотя бы по любому вопросу или моменту;\n\n5. Не уезжайте с места ДТП, если нет крайней необходимости (например, доставить пострадавших в больницу). Вы рискуете получить штраф или лишиться прав в соответствии со ст. 12.27 КоАП РФ.\n', 0),\n" +
    "       (11222, 'Я пострадавший, что мне делать?', '', 0),\n" +
    "       (2121, 'Я виновник, что мне делать?', '', 0),\n" +
    "       (2122, 'Я пострадавший, что мне делать?', '1. Осмотрите всех участников ДТП. При необходимости позвоните в скорую помощь.\n\n2. Если водитель машины пытается скрыться с места ДТП, постарайтесь запомнить номер автомобиля, марку, цвет, иные приметы (вмятины, царапины и т.д.).\n\n3. Рекомендуем не сдвигать самокат с места ДТП.\n\n4. Зафиксируйте место происшествия при помощи средств фото- и видеофиксации.\n\n5. Поищите очевидцев произошедшего. Попросите их контактные данные.\n\n6. Зафиксируйте полученные травмы, повреждения самоката, ущерб иному имуществу.\n\n7. Вызовите и дождитесь сотрудников ГИБДД.\n\n8. Проследите за составлением протокола.\n\n9. Если вина водителя машины будет подтверждена, Вы можете обратиться в страховую компанию водителя машины за получением выплаты. \n\n10. Обратите внимание, что для взыскания морального вреда Вам необходимо обратиться либо напрямую к водителю автомобиля, либо в суд.\n\n11. Если полис ОСАГО водителя будет просрочен, Вы также можете обратиться напрямую к причинителю вреда или в суд.\n\n12. Если водитель скрылся с места ДТП, Постарайтесь найти свидетелей, зафиксировавших факт аварии. Осмотрите прилегающую территорию на предмет наличия камер видеонаблюдения.\n', 0)," +
    "       (31, 'Какие есть ограничения по скорости?', 'Обычно ограничения устанавливаются специальными дорожными знаками с цифрами «60», «40», «110» и т.д. на отдельных участках дороги.\n\n" +
        "В городе, селе и т.д. скорость – не больше 60 км/ч;\n\n" +
        "Во дворах и в жилых районах скорость – не больше 20 км/ч;\n\n" +
        "На автомагистрали – не больше 90 км/ч;\n\n" +
        "Если едете с прицепом по магистрали – не больше 70 км/ч.\n\n" +
        "На автомагистрали может быть разрешено повышать скорость до 130 км/ч, на дороге для автомобилей – до 110 км/ч. Смотрите на соответствующие дорожные знаки.\n\n" +
        "*См. п. 10.1 – 10.3 ПДД\n\n', 0),\n" +
    "       (311, 'Насколько можно превысить скорость, не нарушая правил?', 'Превысить можно на 20 км/ч, не более.\n\n" +
        "*См. ст. 12.9 Кодекса об Административных правонарушениях (КоАП РФ), п. 16 Постановления Пленума Верховного Суда РФ от 25.06.2019 № 20', 0),\n" +
    "       (312, 'Какие штрафы есть за превышение скорости?', 'Зависит от того, с какой скоростью Вы двигались " +
        "и сколько раз Вы уже превышали скорость с момента последнего штрафа/возвращения Вам прав " +
        "(если такое уже было).\n\n', 0),\n" +
    "       (3121, 'Я впервые превысил скорость/оплатил штраф больше года назад/мне вернули права больше года назад.', 'от 20 до 40 км/ч – 500 рублей;\n\n" +
        "от 40 до 60 км/ч – 1000-1500 рублей;\n\n" +
        "от 60 до 80 км/ч – 2000-2500 рублей ИЛИ лишение прав на 4-6 месяцев;\n\n" +
        "от 80 км/ч и выше – 5000 рублей ИЛИ лишение прав на полгода.\n\n" +
        "*См. ст. 12.9 Кодекса об Административных правонарушениях (КоАП РФ)\n\n', 0),\n" +
    "       (3122, 'Я уже превышал скорость: оплатил штраф меньше года назад или мне вернули права меньше года " +
        "назад', 'от 40 до 60 км/ч – 2000-2500 рублей;\n\n" +
        "от 60 км/ч и выше – лишение прав на 1 год ИЛИ штраф в 5000 рублей (если превышение попало на камеру).\n\n" +
        "*См. ст. 12.9 Кодекса об Административных правонарушениях (КоАП РФ)\n\n', 0),\n" +
    "       (3123, 'Что меня ждёт, если я уже превышал скорость больше чем на 60 км/ч, я лишён прав и " +
        "я снова превысил?', 'Ничего хорошего. На Вас заведут уголовное дело. Грозить Вам может как штраф от 200 000 до " +
        "300 000 рублей, как работы, так и лишение свободы до двух лет.\n\n" +
        "Однако, если это нарушение попало на камеры, то уголовного дела не будет.\n\n" +
        "*См. ст. 264.2 Уголовного кодекса (УК РФ), ст. 12.9 Кодекса об Административных правонарушениях (КоАП РФ)\n\n', 0),\n" +
    "       (313, 'Могу ли я узнать показания скорости на радаре у инспектора?', 'Да, и более того, " +
        "инспектор должен показать Вам зафиксированные показания мобильного радара. " +
        "При этом Вы имеете право просмотреть сертификат на радар, в котором содержится " +
        "информация о проверке и погрешности прибора. Это может помочь Вам оспорить нарушение как " +
        "по погрешности, так и по отсутствию пометки о проверке.\n\n" +
        "*См. ст. 26.8, ч. 1 ст. 25.1. КоАП РФ, ст. 151 Приказа МВД России от 23.08.2017 № 664 " +
        "«Об утверждении Административного регламента по надзору за соблюдением требований " +
        "безопасности дорожного движения»\n\n', 0),\n" +
    "       (32, 'Можно ли уплатить штраф меньше?', 'Можно. Для этого уплатите 50% штрафа в течение 20 дней " +
        "со дня, как Вам выписали постановление. \n\n" +
        "Только учтите: если у Вас уже был штраф или Вам вернули права меньше, чем год назад, " +
        "платить придётся полностью. Это касается тех случаев, когда:\n\n" +
        "1. Вы выехали на встречную полосу;\n" +
        "2. Заехали на встречные трамвайные пути;\n" +
        "3. Поехали по дороге с односторонним движением не в ту сторону;\n" +
        "4. Снова превысили скорость более чем на 40 км/ч.\n\n" +
        "Уплатить только 50% можно, если:\n\n" +
        "1) Вы впервые (или больше года назад с момента оплаты последнего штрафа/возвращения прав) превышали скорость;\n" +
        "2) Вы впервые (или больше года назад с момента оплаты последнего штрафа/возвращения прав) не зарегистрировали машину;\n" +
        "3) Вы забыли права, полис ОСАГО или др. документы или дали машину другу без прав;\n" +
        "4) Наклеили знак «Инвалид», но сами – не инвалид;\n" +
        "5) Управляли машиной с неисправностями;\n" +
        "6) Не оформили диагностическую карту;\n" +
        "7) Слишком затонировали стёкла;\n" +
        "8) Были беды с ремнём безопасности или ехали с телефоном в руке;\n" +
        "9) Ездили без прав;\n" +
        "10) Неправильно парковались или неправильно ехали по дороге;\n" +
        "11) Впервые (или больше года назад с момента оплаты последнего штрафа/возвращения прав) проехали на красный свет;\n" +
        "12) Не выполнили того, что требуется от Вас при ДТП (см. Инструкцию [здесь вставить гиперссылку на Инструкцию «Вы попали в ДТП»])\n" +
        "* См. ч. 1.3 ст. 32.2 КоАП РФ\n', 0),\n" +
    "       (33, 'Можно ли ехать, разговаривая по телефону?', 'Да, можно. " +
        "Только не забудьте его расположить на стойке или на держателе.', 0),\n" +
    "       (331, 'А в руках можно держать?', 'Не следует. Во-первых, Вы больше отвлекаетесь от дороги. " +
        "Во-вторых, Ваша хватка на руле не настолько надёжная, часть Вашего внимания уходит мимо управления машины. " +
        "И в-третьих, это запрещено. Рискуете получить штраф 1 500 рублей.\n" +
        "* См. ст. 12.36.1. КоАП РФ\n', 0),\n" +
    "       (34, 'Что страхует ОСАГО?', 'какой-то текст', 0),\n" +
        "       (341, 'Что будет, если ОСАГО просрочен?', 'За просрочку полиса ОСАГО Вам могут назначить штраф в 500 рублей, а за отсутствие полиса в принципе – штраф 800 рублей.\n', 0),\n" +
        "       (342, 'Когда можно оформить Европротокол?\n', 'Убедитесь, что:\n\n" +
        "1. В ДТП нет потерпевших;\n\n" +
        "2. В ДТП участвуют только два ТС;\n\n" +
        "3. Повреждения получили только участвовавшие в ДТП автомобили;\n\n" +
        "4. И Вы, и второй водитель вписаны в действующие полисы ОСАГО или международный полис «Зеленая карта», выданные на участвующие в ДТП автомобили;\n\n" +
        "5. По предварительной оценке нанесенный ТС ущерб не превышает максимальную сумму страховой выплаты;\n\n" +
        "6. Вы и второй водитель согласны оформить ДТП без вызова сотрудников ГИБДД и подписать Европротокол.\n\n" +
        "Если вы не уверены в обстоятельствах аварии, оценке нанесенного ущерба, конструктивном настрое второго участника ДТП, то оформляйте аварию в обычном порядке.\n\n" +
        "Учтите, что за просрочку полиса ОСАГО Вам могут назначить штраф в 500 рублей, а за отсутствие полиса в принципе – штраф 800 рублей.\n\n" +
        "*См. ст. 11.1 ФЗ «Об ОСАГО», ст. 12.37 КоАП РФ, п. 2.6.1. ПДД\n\n', 0),\n" +
    "       (35, 'Где можно парковаться?', 'На правой стороне дороги на обочине, а если её нет – у края проезжей части.\n\n" +
        "* См. п. 12.1. ПДД\n', 0),\n" +
        "       (351, 'Можно ли парковаться на левой стороне?', 'Да, можно, если в городе/селе и т.д. на дороге – " +
        "две полосы (одна – попутная, другая – встречная), нет трамвайных путей, а также на дороге с односторонним движением.\n\n" +
        "* См. абзац второй п. 12.1. ПДД\n', 0),\n" +
        "       (352, 'Можно ли парковаться на тротуаре?', 'Да, но только на краю тротуара, граничащего с " +
        "проезжей частью, если место отмечено соответствующим дорожным знаком и табличкой, на которой " +
        "указан способ парковки и разрешение для легковых автомобилей. \n\n" +
        "* См. абзац второй п. 12.2. ПДД\n', 0),\n" +
        "       (353, 'Можно ли парковаться на пешеходном переходе?', 'Это запрещено. И в 5 метрах перед переходом тоже.\n\n" +
        "* См. п. 12.4, 12.5 ПДД\n', 0),\n" +
        "       (354, 'Мне выписали штраф за неправильную парковку. Как обжаловать?', 'Здесь " +
        "[ссылка внутри документа на раздел «Как обжаловать?»] Вы найдёте информацию, как подать жалобу или иск по Вашей ситуации.\n', 0),\n" +
    "       (36, 'Когда нужно уступать дорогу?', 'Это один из наиболее сложных вопросов в ПДД, " +
        "поэтому выберите в списке Вашу ситуацию.', 0),\n" +
    "       (361, 'Тут будет вопрос', '', 0),\n" +
    "       (362, 'Я выезжаю со двора', 'Вы должны уступить дорогу всем участникам движения, а потом уже ехать.', 0),\n" +
    "       (37, 'Насколько сильно можно тонировать стекла?', '', 0),\n" +
    "       (371, 'Какие штрафы есть за тонировку стекла?', '', 0),\n" +
    "       (372, 'Как замеряется тонировка?', '', 0),\n" +
    "       (373, 'Как обжаловать штраф за тонировку?', '', 0),\n" +
    "       (41, 'Вы являетесь пешеходом', '', 0),\n" +
    "       (42, 'Вы являетесь водителем', '', 0),\n" +
    "       (43, 'Как определить?', 'Тут будет тест\n', 1),\n" +
    "       (61, 'Первая поездка', '1. Убедитесь, что у самоката нет дефектов, деформации креплений.\n\n" +
        "2. Проверьте, насколько легко нажимаются ручки, тормоза, хорошо ли закреплены все болты, удерживается ли телескопическая стойка руля\n\n" +

        "3. Обеими руками возьмитесь за руль. \n\n" +
        "4. Нажмите на кнопку включения электросамоката. \n\n" +
        "5. Дождитесь включения.\n\n" +
        "6. Поставьте одну ногу на платформу.\n\n" +
        "7. Второй ногой отталкивайтесь от земли. \n\n" +
        "8. Продолжая отталкиваться, задайте удобную для Вас скорость.\n\n" +
        "9. Для регулирования скоростного режима нажимайте рычаг на рукоятке руля. Чем сильнее надавливать на рычаг, тем выше скорость;\n\n" +
        "10. Для поворота используйте руль.\n\n" +
        "11. Не отпускайте руль во время поездки.\n\n" +
        "12. Для завершения поездки нажмите на специальный рычаг. Не стоит сильно нажимать на рычаг во избежание мгновенной остановки средства.\n\n', 0),\n" +
    "       (62, 'Правила безопасности', '1. Набирайте скорость плавно.\n\n" +
        "2. Не делайте резких маневров, поворотов, торможений.\n\n" +
        "3. Помните, что транспортное средство является одноместным.\n\n" +
        "4. Перед каждой поездкой проверяйте работу тормозной системы.\n\n" +
        "5. Обратите внимание на уровень заряда, если планируете совершать длительные поездки.\n\n" +
        "6. Рычаг газа устройства не должен западать или заедать.\n\n" +
        "7. Тормозите заранее, как и при разгоне, планируйте свой тормозной путь.\n\n" +
        "8. Рекомендуется иметь при себе световозвращающие элементы. Если нет фар, подсветите дорогу фонариком.\n\n" +
        "9. Не садитесь за руль электросамоката в случае плохого самочувствия.\n\n" +
        "10. Не допускайте контакта электросамоката с водой во избежание короткого замыкания.\n\n" +
        "11. Не касайтесь работающего двигателя и вращающихся колес электросамоката.\n\n" +
        "12. Не рекомендуется использовать электросамокат при отрицательных температурах, " +
        "поскольку это снизит ресурс батареи, а также ухудшит управляемость.\n\n" +
        "13. Не прыгайте с бордюров.\n\n" +
        "14. Не пейте и не ешьте во время движения\n\n', 0),\n" +
    "       (63, 'Возможные претензии владельцев сервисов к пользователям', '', 0),\n" +
    "       (64, 'Как определить мощность и скорость самоката', '', 0);"

const val FILL_NODE = "" +
    "INSERT INTO node\n" +
    "VALUES (1, 11),\n" +
    "       (2, 21),\n" +
    "       (1, -2),\n" +
    "       (2, -2),\n" +
    "       (5, -2),\n" +
        "       (5, -21),\n" +
        "       (5, -22),\n" +
        "       (5, -23),\n" +
        "       (5, -24),\n" +
        "       (5, -25),\n" +
        "       (5, -26),\n" +
    "       (3, 31),\n" +
    "       (31, 311),\n" +
    "       (31, 312),\n" +
        "       (312, 3121),\n" +
        "       (312, 3122),\n" +
        "       (312, 3123),\n" +
    "       (31, 313),\n" +
    "       (3, 32),\n" +
    "       (3, 33),\n" +
    "       (33, 331),\n" +
    "       (3, 34),\n" +
        "       (34, 341),\n" +
        "       (34, 342),\n" +
    "       (3, 35),\n" +
        "       (35, 351),\n" +
        "       (35, 352),\n" +
        "       (35, 353),\n" +
        "       (35, 354),\n" +
    "       (3, 36),\n" +
    "       (36, 361),\n" +
    "       (36, 362),\n" +
    "       (3, 37),\n" +
        "       (37, 371),\n" +
        "       (37, 372),\n" +
    "       (4, 41),\n" +
    "       (4, 42),\n" +
    "       (4, 43),\n" +
    "       (1, 12),\n" +
    "       (1, 13),\n" +
        "       (13, 131),\n" +
        "       (13, 132),\n" +
        "       (13, 133),\n" +
            "       (133, 1331),\n" +
            "       (133, 1332),\n" +
        "       (13, 134),\n" +
    "       (1, 14),\n" +
    "       (1, 16),\n" +
    "       (1, 17),\n" +
    "       (1, 18),\n" +
    "       (1, 19),\n" +
//    "       (-2, -21),\n" +
//    "       (-2, -22),\n" +
//    "       (-2, -23),\n" +
//    "       (-2, -24),\n" +
//    "       (-2, -25),\n" +
//    "       (-2, -26),\n" +
    "       (21, 211),\n" +
    "       (21, 212),\n" +
    "       (21, 213),\n" +
    "       (112, 1121),\n" +
    "       (112, 1122),\n" +
    "       (112, 1123),\n" +
    "       (112, 1124),\n" +
    "       (1122, 11221),\n" +
    "       (1122, 11222),\n" +
    "       (212, 2121),\n" +
    "       (212, 2122),\n" +
    "       (6, 61),\n" +
    "       (6, 62),\n" +
    "       (6, 63),\n" +
    "       (6, 64);"

const val DROP_TABLE_NODE = "DROP TABLE IF EXISTS node;"
const val DROP_TABLE_QUESTION = "DROP TABLE IF EXISTS question;"
