public class Main {
    public static void main(String[] args) {
//Задача №1
        System.out.println("Задача №1");
        int firstFriday = 3;// первая пятница в месяце
        for (; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
        }
        // Задача №2
        System.out.println("Задача №2");
        int totalDistance = 42195; // дистанция на марафоне
        int interval = 500; // интервал уведомлений
        System.out.println("а) Решение задачи с использованием цикла do-while");
        int distanceDoWhile = 0;
        do
        {//увеличиваем дистанцию в начале шага. Чтобы первое сообщение не было "Осталось 42195", сначала проходим 500м.
            distanceDoWhile = distanceDoWhile + interval;
            if (distanceDoWhile <= totalDistance) {
                int remaining = totalDistance - distanceDoWhile;
                System.out.println("Держись! Осталось " + remaining + " метров");
            }
        } while (distanceDoWhile < totalDistance);
        System.out.println(" б) Решение задачи с использованием цикла for");
        int distanceFor = interval;
        for (; distanceFor <= totalDistance; distanceFor = distanceFor + 500) {
            System.out.println("Держитесь! Осталось " + (totalDistance - distanceFor) + " метров");
        }
        //Задача №3
        System.out.println("Задача №3");
        int budget = 600; //пользователь вводит сумму
        int priceOneDay = 100;
        System.out.println("Программа с использованием цикла while");
        int dayWhile = 0;
        int budgetWhile = budget;
        while (budgetWhile >= priceOneDay) {
            dayWhile = dayWhile + 1;
            if (dayWhile % 5 == 0) {
                continue;//Пятый день бесплатно
            }
            budgetWhile = budgetWhile - priceOneDay;
        }
        System.out.println("При бюджете " + budget + " рублей, парковка доступна на " + dayWhile + " дней");
        System.out.println("Программа с использованием цикла for");
        int dayFor = 0;
        int budgetFor = budget;
        for (; budgetFor >= priceOneDay; dayFor = dayFor + 1) {
            if (dayFor % 5 == 0) {
                continue;//пятый день бесплатно
            }
            budgetFor = budgetFor - priceOneDay;
        }
        dayFor = dayFor - 1;
        System.out.println("При бюджете " + budget + " рублей, парковка доступна на " + dayFor + " дней");
        //Задача №4
        System.out.println("Задача №4");
        int month = 0; // текущий номер месяца
        double total = 0; //текущая сумма накоплений
        int monthlyAmount = 15000; //ежемесячная добавляемая сумма
        int capital = 12_000_000; //желаемая сумма для накопления
        while (true) {
            month = month + 1;//переход к след. месяцу
            total = total + monthlyAmount;//ежемесячное пополнение
            if (month % 6 == 0) {
                total = total + (total * 0.07);//каждые пол года начисляем 7%
            }
            System.out.println("Месяц " + month + ", сумма накоплений: " + String.format("%.2f", total));

            if (total >= capital) {
                System.out.println("Цель достигнута");
                System.out.println("Итого понадобится  " + month + " месяцев, чтобы накопить " + String.format("%.2f", total) + " рублей");
                break;
            }
        }
        //Задача №5
        System.out.println("Задача №5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            // проверка перегрева каждые 10 минут
            if (minute % 10 == 0) {
                overheats++;
                //если четвертый перегрев, то выходим
                if (overheats > 3) {
                    break;
                }
                System.out.println("Перегрев! Пауза 2 минуты. Всего перегревов: " + overheats);
                minute = minute + 2;//пропускаем 2 минуты зарядки
                continue;
            }
            charge = charge + 2;//обычный заряд
            if (charge > 100) {//
                charge = 100;
            }
        }
        if (overheats > 3) {
            System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
        } else {
            System.out.println("Зарядка завершена на 100%.");
        }
        System.out.println("Время зарядки составило " + minute + " минут.");
    }
}