public class Main {
    public static void main(String[] args) {
int a = 1000;
byte b = 92;
short c = 1234;
long l = 123_456_789L;
float f = 1.2F;
double d = 3.4D;
System.out.println("Значение переменной " + a + " с типом int равно");
        System.out.println("Значение переменной " + b + " с типом byte равно");
        System.out.println("Значение переменной " + c + " с типом short равно");
        System.out.println("Значение переменной " + l + " с типом long равно");
        System.out.println("Значение переменной " + f + " с типом float равно");
        System.out.println("Значение переменной " + d + " с типом double равно");
int a1 = -159;
byte b1  = 67 ;
short c1 = 569;
short c2 = 27897;
long l1 = 987_678_965_549L;
float f1 = 27.12F;
double d1 = 2.786D;

int luda = 23;
int anna = 27;
int katya = 30;
int child = (luda + katya + anna);
System.out.println("на каждого ученика рассчитано " + 480/(child) + " листов бумаги");

int mash = 16/2;
int mash2 = mash * 20;
int mashDay = mash * 60 * 24;
int mash3Days = mashDay * 3;
int mashMoth = mashDay * 30;
System.out.println("за 20 минут машина произвела " + mash + " бутылок");
System.out.println("за сутки машина произвела " + mash2 + " бутылок");
System.out.println("за 3 дня машина произвела " + mash3Days + " бутылок" );
System.out.println("за месяц машина произвела " + mashMoth + " бутылок");

int canWhite = 2;
int canBrown = 4;
int scoolClass = 120 / (canWhite + canBrown);
int classWhite = 2 * scoolClass;
int classBrown = 4 * scoolClass;
System.out.println("В школе, где " + scoolClass + " классов, нужно " + classWhite + " банок белой краски и " + classBrown + " банок коричневой краски");


int bananas = (5) * 80;
int milk = (200 / 100) * 105;
float iceCream = 2 * 100;
float eggs =  (4) * 70;
float breakfast = bananas + milk + iceCream + eggs;
float breakfastGr = breakfast / 1000;
System.out.println("Вес спортзавтрака составил " + breakfast + " грамм");
System.out.println("Вес спортзавтрака составил " + breakfastGr + " килограмм");

    int weight1 = 250;
    int weight2 = 500;
    int finalWeight1 = 7000 / 500;
    int finalWeight2 = 7000 / 250;
    System.out.println(finalWeight1 + "дней при потере веса каждый день 250 гр.");
    System.out.println(finalWeight2 + "дней при потере веса каждый день 500 гр." );

    int masha = 67_760;
    int denis = 83_690;
    int kris = 76_230;
    float mashaMoney = 67_760 * 1.1F;
    float denisMoney = 83_690 * 1.1F;
    float krisMoney = 76_230 * 1.1F;
    float mashaYearMoney = mashaMoney * 12;
    float denisYearMoney = denisMoney * 12;
    float krisYearMoney = krisMoney * 12;
    double mashaDifference = mashaYearMoney - (masha * 12);
    double denisDifference = denisYearMoney - (denis * 12);
    double krisDifference = krisYearMoney - (kris * 12);
    System.out.println("маша теперь получает " + mashaMoney + " руб. Годовой доход вырос на " + mashaDifference);
    System.out.println("денис теперь получает " + denisYearMoney +  " руб. Годовой доход вырос на " + denisDifference);
    System.out.println("кристина теперь получает " + krisMoney + " руб. Годовой доход вырос на " + krisDifference);




    }
}
