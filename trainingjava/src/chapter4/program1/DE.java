package chapter4.program1; // good

import java.util.ArrayList;// good

public class DE {// good
	ArrayList<Eemploye> EemployeList = new ArrayList<>(); // good
	String name; //??
	ArrayList<String> BusyoList = new ArrayList<>(); // good

	public Eemploye newEemploye(String name, String busyo) {// good
		Eemploye x = new Eemploye(name, busyo);// good
		EemployeList.add(new Eemploye(name, busyo));// newいらない
		return x;　// good
	}

	public void displayEemployeList() {// good

		for (Eemploye y : EemployeList) {// good
			System.out.println(y);// ？？
		}

	}
}


package chapter4.program1;
import java.util.ArrayList;

// DEクラス（会社クラス）
public class DE {
    private final String companyName = "BT/DE"; // 会社名（固定）
    private ArrayList<Employee> employeeList = new ArrayList<>(); // 従業員リスト
    private ArrayList<String> departmentList = new ArrayList<>(); // 部署リスト

    // コンストラクタ - 部署リストの初期化
    public DE() {
        // 3部署の設定
        departmentList.add("人事");
        departmentList.add("営業");
        departmentList.add("エンジニア");
    }
    
    // 従業員作成メソッド（エンジニア以外用）
    public Employee newEmployee(String name, String department) {
        Employee employee = new Employee(name, department);
        employeeList.add(employee);
        return employee;
    }
    
    // 従業員作成メソッド（エンジニア用）- オーバーロード
    public Engineer newEngineer(String name, String department, String language) {
        Engineer engineer = new Engineer(name, department, language);
        employeeList.add(engineer);
        return engineer;
    }
    
    // 従業員情報表示
    public void displayEmployeeList() {
        System.out.println("【" + companyName + " 従業員一覧】");
        for (Employee employee : employeeList) {
            employee.displayInfo();
        }
    }
}

