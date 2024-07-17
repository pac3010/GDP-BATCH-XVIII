import Data.dataStatic;

public class CrudCourse {
    public static void main(String[] args){

    Login login = new Login();
    login.displayLoginInformation();

    Employee employee = new Employee();
    employee.displayEmployeeInformation();

    }
}
 
class Login {
    public void displayLoginInformation() {
        System.out.println(checkCredentials("putri.anggia", "qwEr1234JJ"));
    }

    public static boolean checkCredentials(String uname, String pass) {
    
        for (int i = 0; i < dataStatic.username.length; i++) {
            if (uname.equals(dataStatic.username[i]) && pass.equals(dataStatic.password[i])) {
                return true;
            }
        }
        return false;
    }
}

class Employee{
    public void displayEmployeeInformation(){
        int num = 1;
        System.out.format("%-3s | %-25s | %-30s |\n", "No", "Nama", "Email");
        for(int i = 0; i<dataStatic.nameArr.length; i++){
            System.out.format("%-3d | %-25s | %-30s |\n", num, dataStatic.nameArr[i], dataStatic.emailArr[i]);
            num++;
        }
    }

}

