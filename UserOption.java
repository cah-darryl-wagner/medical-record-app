public class UserOption {
    //private int option;

    public UserOption(){

    }

    public void getUserOption(int option) {
        UserMenu um = new UserMenu();
        if(option > um.getMenuItemLen())
            System.out.println("Sorry, that is not a valid menu option");
        else
            System.out.println(option);


    }

}
