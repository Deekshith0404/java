package dto;

import application.Application;

public class App {
    Application application[] = new Application[5];
    int index;

    public String saveDetail(Application dto) {
        this.application = application;
        if (application != null) {
            application[index] = dto;
            index++;
            return "data is saver";
        }

        return "not saved";
    }

    public void read() {
        for (int i = 0; i < application.length; i++) {
            System.out.println(application[i]);
        }
    }

    public void findAppDetailByModelNum(int modelNum) {
        for (int i = 0; i < application.length; i++) {
            if (application[i].getModelNum() == modelNum) {
                System.out.println("application data by number \n"+application[i]);
            }
        }
    }

    public void findAppUsingName(String mobileName) {
        for (int i = 0; i < application.length; i++) {
            if (application[i].getMobileName().equals(mobileName)) {
                System.out.println("application data by name \n"+application[i]);
            }
        }
    }
}
