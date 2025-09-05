package edu.collection.pack1.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManage {

    public static void main(String[] args) {
        employeeManage();
    }

    /**
     * 🏢 회사 직원 관리 시스템 🏢
     * 1. 직원 등록
     * 2. 전체 직원 조회
     * 3. 급여 수정
     * 4. 직원 퇴사
     * 5. 급여 통계
     * 0. 종료
     */
    public static void employeeManage() {
        List<String> nameList = new ArrayList<>();
        List<Integer> salaryList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 메뉴 출력
            System.out.println("\n🏢===== 회사 직원 관리 시스템 =====🏢");
            System.out.println("1️⃣ 직원 등록");
            System.out.println("2️⃣ 전체 직원 조회");
            System.out.println("3️⃣ 급여 수정");
            System.out.println("4️⃣ 직원 퇴사");
            System.out.println("5️⃣ 급여 통계");
            System.out.println("0️⃣ 시스템 종료");
            System.out.print("메뉴 선택 ➤ ");

            int menu;
            try {
                menu = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("❗ 숫자로 입력해주세요.");
                continue;
            }

            switch (menu) {
                case 1: { // 직원 등록
                    System.out.println("\n👨‍💼===== 직원 등록 =====👨‍💼");
                    System.out.print("직원 이름을 입력하세요: ");
                    String name = sc.nextLine().trim();

                    if (name.isEmpty()) {
                        System.out.println("이름은 비울 수 없습니다.");
                        break;
                    }
                    if (nameList.contains(name)) {
                        System.out.println("이미 등록된 직원입니다.");
                        break;
                    }

                    System.out.print("급여를 입력하세요(만원 단위): ");
                    String salaryStr = sc.nextLine().trim();
                    int salary;
                    try {
                        salary = Integer.parseInt(salaryStr);
                        if (salary < 0) {
                            System.out.println("급여는 음수가 될 수 없습니다.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("올바른 숫자를 입력해주세요.");
                        break;
                    }

                    nameList.add(name);
                    salaryList.add(salary);
                    System.out.println(name + " 직원이 등록되었습니다! (급여: " + salary + "만원)");
                    break;
                }

                case 2: { // 전체 직원 조회
                    System.out.println("\n📋===== 전체 직원 조회 =====📋");
                    if (nameList.isEmpty()) {
                        System.out.println("등록된 직원이 없습니다.");
                    } else {
                        for (int i = 0; i < nameList.size(); i++) {
                            System.out.println((i + 1) + ". " + nameList.get(i) + " - " + salaryList.get(i) + "만원");
                        }
                    }
                    break;
                }

                case 3: { // 급여 수정
                    System.out.println("\n💰===== 급여 수정 =====💰");
                    System.out.print("급여를 수정할 직원 이름을 입력하세요: ");
                    String modifyName = sc.nextLine().trim();

                    int idx = nameList.indexOf(modifyName);  // 우리가 찾는 이름과 name리스트에서 일치하는 이름의 index 번호
                    if (idx == -1) {
                        System.out.println("존재하지 않는 직원입니다.");
                        break;
                    }

                    System.out.println(modifyName + " 직원의 현재 급여: " + salaryList.get(idx) + "만원");
                    System.out.print("새로운 급여를 입력하세요(만원 단위): ");
                    String newSalaryStr = sc.nextLine().trim();
                    int newSalary;
                    try {
                        newSalary = Integer.parseInt(newSalaryStr);
                        if (newSalary < 0) {
                            System.out.println("급여는 음수가 될 수 없습니다.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("올바른 숫자를 입력해주세요.");
                        break;
                    }

                    salaryList.set(idx, newSalary);
                    System.out.println("급여가 수정되었습니다!");
                    break;
                }

                case 4: { // 직원 퇴사
                    System.out.println("\n👋===== 직원 퇴사 =====👋");
                    System.out.print("퇴사할 직원 이름을 입력하세요: ");
                    String deleteName = sc.nextLine().trim();

                    int delIdx = nameList.indexOf(deleteName);
                    if (delIdx == -1) {
                        System.out.println("존재하지 않는 직원입니다.");
                        break;
                    }

                    nameList.remove(delIdx);
                    salaryList.remove(delIdx);
                    System.out.println(deleteName + " 직원이 퇴사 처리되었습니다.");
                    break;
                }

                case 5: { // 급여 통계
                    System.out.println("\n📊===== 급여 통계 =====📊");
                    if (salaryList.isEmpty()) {
                        System.out.println("등록된 직원이 없습니다.");
                        break;
                    }

                    int total = 0;
                    int max = Integer.MIN_VALUE;
                    int min = Integer.MAX_VALUE;

                    for (int sal : salaryList) {
                        total += sal;
                        if (sal > max) max = sal;
                        if (sal < min) min = sal;
                    }
                    double avg = (double) total / salaryList.size();

                    System.out.println("총 직원 수: " + salaryList.size() + "명");
                    System.out.println("총 급여: " + total + "만원");
                    System.out.println("평균 급여: " + avg + "만원");
                    System.out.println("최고 급여: " + max + "만원");
                    System.out.println("최저 급여: " + min + "만원");
                    break;
                }

                case 0:
                    System.out.println("\n🏢 직원 관리 시스템을 종료합니다. 🏢");
                    System.out.println("수고하셨습니다! 👋");
                    return;

                default:
                    System.out.println("❗ 잘못된 번호입니다. 0~5번 중에서 선택해주세요!");
            }
        }
    }
}
