public class UserMenu extends WelcomeMenu{
    private char menuType;
    private final String[] menuItems = new String[5];

    public UserMenu(){}

    public UserMenu(char menuType) {
        this.menuType = menuType;
    }

    public int getMenuItemLen(){
        return menuItems.length;
    }


    private void buildAdminMenu(){
        menuItems[0] = "1.) Register Patient";
        menuItems[1] = "2.) Make appointment";
        menuItems[2] = "3.) Enter Doctor";
        menuItems[3] = "4.) Cancel appointment";
        menuItems[4] = "5.) List patients";
    }

    private void buildPatientMenu(){
        menuItems[0] = "1.) Register Patient";
        menuItems[1] = "2.) Make appointment";
        menuItems[2] = "3.) Enter Doctor";
        menuItems[3] = "4.) Cancel appointment";
        menuItems[4] = "5.) List patients";
    }

    private void buildDoctorMenu(){
        menuItems[0] = "1.) Register Patient";
        menuItems[1] = "2.) Make appointment";
        menuItems[2] = "3.) Enter Doctor";
        menuItems[3] = "4.) Cancel appointment";
        menuItems[4] = "5.) List patients";
    }


    public void DisplayUserMenu(){
        System.out.println("Please Enter Option or type 'exit' to leave application.");
        switch (menuType) {
//doctor
            case 'd' -> System.out.println("Doctor Menu");
//admin
            case 'a' -> {
                buildAdminMenu();
                for (String s : menuItems) {
                    System.out.println(s);
                }
            }
//patient
            case 'p' -> System.out.println("Patient Menu");
            default -> System.out.println("Invalid menu option");
        }
    }
}
