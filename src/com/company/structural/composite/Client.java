package com.company.structural.composite;


/*
Composite to manie taht ol lafzi hamon morakab hast
hala in pattern be che dardi mikhore
Composite vase daste bandi kardane Object ha o set kardaneshon to ye Object be dardemon mikhore
bezar intori begam ye seri object ro to ye object ke ma inja list gozashtim daste bandi mikonim
va to jaei karaei dare ke ma estelahan sakhtar tree darim
age be mesal negah koni mibini ke ma ye object Employee darim ke Component ma ya hamon head tree mahsob mishe
hala mitoni object haye ke to selsele maratebe [hierarchies] component ma hastan ro to ye object dastebandi konim
 */


public class Client {
    public static void main(String[] args) {
        Developer dev1 = new Developer("jafar", "backend", 1);
        Developer dev2 = new Developer("hassan", "frontend", 2);
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployees(dev1);
        engDirectory.addEmployees(dev2);

        Manager man1 = new Manager("karim", "CTO", 3);
        Manager man2 = new Manager("ali", "HEAD", 4);

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployees(man1);
        accDirectory.addEmployees(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployees(engDirectory);
        directory.addEmployees(accDirectory);
        directory.showDetails();
    }
}
