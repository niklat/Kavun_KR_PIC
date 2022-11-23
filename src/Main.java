import java.util.Scanner;
    public  class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Scanner line = new Scanner(System.in);
            Magazine user1 = null;
            Magazine user2 = null;
            int count = 0;
            int point;
            while (true) {
                System.out.println("Оберіть дію:");
                System.out.println("1.Новий вчитель.");
                System.out.println("2.Додати предмет.");
                System.out.println("3.Переглянути журнал.");
                point = in.nextInt();
                switch (point) {
                    case 1 :
                        if ((count%2) == 0) {
                            user1 = Magazine.getInstance();
                        } else {
                            user2 = Magazine.getInstance();
                        }
                        System.out.println("Вчитель№" + (count%2+1));
                        count++;
                        break;
                    case 2 :
                        if (((count+1)%2) == 0) {
                            user1.addNewSubject(line.nextLine());
                        } else {
                            user2.addNewSubject(line.nextLine());
                        }

                        break;
                    case 3 :
                        System.out.println("Список всіх предметів:");
                        if (((count+1)%2) == 0) {
                            user1.readSubject();
                        } else {
                            user2.readSubject();
                        }
                        break;
                }
            }
        }
    }