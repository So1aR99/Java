import java.util.ArrayList;
import java.util.Scanner;

class Information {
    private int id;
    private String name;
    private String phone;

    public Information(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getPhone() {return phone;}

    public void setPhone(String phone) {this.phone = phone;}

    public String toString() {
        return String.format("%-3d %-4s %s", id, name, phone);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Information> list = new ArrayList<>();

        while (true) {
            System.out.println("----------------------------");
            System.out.println("1. 데이터 삽입");
            System.out.println("2. 데이터 삭제");
            System.out.println("3. 데이터 조회");
            System.out.println("4. 데이터 수정");
            System.out.println("5. 프로그램 종료 ");
            System.out.println();

            System.out.print("메뉴 선택 : ");
            String input = sc.nextLine();
            System.out.println();

            int num;
            try {
                num = Integer.parseInt(input);
            }catch (NumberFormatException e){
                System.out.println("숫자를 입력하세요.");
                continue;
            }

            switch (num) {
                case 1:
                    System.out.println("데이터 삽입 선택");
                    int a;
                    while (true) {
                        System.out.print("ID를 입력해 주세요 : ");
                        String excep = sc.nextLine();
                        try {
                            a = Integer.parseInt(excep);
                            break;
                        }catch (NumberFormatException e) {
                            System.out.println("숫자를 입력하세요.");
                        }
                    }

                    System.out.print("이름을 입력해 주세요 : ");
                    String b = sc.nextLine();

                    System.out.print("전화번호를 입력해 주세요 : ");
                    String c = sc.nextLine();
                    System.out.println();

                    list.add(new Information(a, b, c));
                    System.out.println("데이터가 정상적으로 입력되었습니다");
                    break;
                case 2:
                    System.out.println("데이터 삭제 선택");
                    System.out.print("삭제할 ID선택 : ");
                    int del = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    for(int i=0; i<list.size(); i++) {
                        if(list.get(i).getId() == del) {
                            list.remove(i);
                            System.out.println("데이터가 삭제되었습니다.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("데이터 조회 선택");
                    System.out.println();
                    System.out.println("ID   NAME    HP");
                    System.out.println("----------------------------");
                    for(Information info : list) {
                        System.out.println(info);
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("데이터 수정 선택");
                    System.out.println();
                    System.out.print("수정할 ID 입력 : ");
                    int edit = sc.nextInt();
                    sc.nextLine();

                    for(Information info : list) {
                        if(info.getId() == edit) {
                            System.out.print("새 이름 입력 : ");
                            String newname = sc.nextLine();

                            System.out.print("새 번호 입력 : ");
                            String newphone = sc.nextLine();

                            info.setName(newname);
                            info.setPhone(newphone);
                            System.out.println();
                            System.out.println("데이터가 정상적으로 수정되었습니다.");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("프로그램이 종료되었습니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
    }
}
