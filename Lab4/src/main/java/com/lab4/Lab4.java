package com.lab4;

public class Lab4 {
    public static void main(String[] args) {

        TerribleNoise terribleNoise = new TerribleNoise();
        LightCloudOfDust lightCloudOfDust = new LightCloudOfDust();
        Homsa homsa = Homsa.getInstance();
        ScreamOfMisa screamOfMisa = new ScreamOfMisa();
        DarkDarkness darkDarkness = new DarkDarkness();
        Something something = new Something();

        InvisibleEnemy invisibleEnemy = new InvisibleEnemy();
        Rustle rustle = new Rustle();
        Enemy enemy = new Enemy();
        SimplePersonImpl dayLight = new SimplePersonImpl("Дневной свет", HeroType.NOTLIVE){
            public void move() {
                System.out.println(getName() + " лился;");
            }
        };

        TextLogic textLogic = TextLogic.getInstance();
        Mymla mymla = new Mymla();
        MymiTroll.Mom mom = new MymiTroll.Mom();
        MymiTroll mymiTroll = new MymiTroll();
        Misa misa = new Misa();

        terribleNoise.move();
        lightCloudOfDust.move();
        homsa.giveKnife();
        homsa.go();
        screamOfMisa.move();
        darkDarkness.move();
        something.sSoftMove(homsa);
        homsa.clopEye();
        homsa.cut(invisibleEnemy.getName());
        rustle.move();
        enemy.move();
        homsa.decide();
        homsa.toSee();
        dayLight.move();

        mymla.amazed();

        try {
            textLogic.ander(mymla.getName(), mymla.laugh(), mymla.creep());
        } catch (ParameterException e) {
            e.printStackTrace();
        }

        mymla.interest();
        textLogic.act(mom.getName(), mom.pull(), mymiTroll.scream(), mymiTroll.getName());
//        textLogic.act(somethingBigAndTerrible.getName(), somethingBigAndTerrible.fall(), misa.add(), misa.getName());
        textLogic.act(something.getNameT(), something.sTerribleFall(), misa.add(), misa.getName());

        System.out.println("End");
    }
}
//        Ctrl + W              - Выбирает последовательность возрастающих блоков кода
//        Ctrl + /	            - Однострочное комментирование / раскомментирование
//        Ctrl + Shift + /	    - Многострочное комментирование / раскомментирование
//        Ctrl + D              - Копировать текущую строку
//        Ctrl + Y              - Удалить текущую строку
//        Ctrl + Shift + J      - Объединение строк
//        Alt + Q               - Контекстная информация (быстрый поиск документации)
//        Alt + Enter	        - Показать предлагаемое исправление
//        Ctrl + Alt + L	    - Форматирование кода
//        Ctrl + Alt + O	    - Удалить неиспользуемые импорты
//        Ctrl + Alt + I	    - Авто-отступ линии
//        Tab / (Shift + Tab)   - Отступ / удаление отступа выбранному фрагменту кода
//        Shift + Enter         - Начать с новой строки
//        Ctrl + P              - Сведения о параметрах (в пределах аргументов вызоваемого метода)
//        Ctrl + Shift + Enter  - Завершение оператора
//        Ctrl + O              - Переопределение метода
//        Alt + Insert          - Генерация кода (Getter, Setter, Constructor, hashCode/equals, toString)
//        Ctrl + Alt + T        - Поместить фрагмент кода в операторы
//        Ctrl + Shift + ] / [	- Выделить код до конца / начала блока
//        Ctrl + Delete / BS    - Удалить слово посел / перед курсора
//        Ctrl + Shift + '-'	- Свернуть все



