package rs.ac.ni.pmf.oop2.januar.kol2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeFactory {

    private static final ArrayList<Employee> employees = new ArrayList<>();
    static {
        Project FactorAuthentication = new Project("Two Factor Authentication", "Authentication", "Kristijan Peric");
        Project CommonUI = new Project("Common UI", "UI", "Viktor Novakovic");
        Project Pegasus = new Project("Pegasus Model", "Data", "Pablo");
        Project RemoveUsers = new Project("Remove Invalid User", "Proxy", "Pablo");
        Project SiteReliability = new Project("Site Reliability", "Admin", "Pablo");
        Project DataTransition = new Project("Data Transition", "Data", "Kristijan Peric");
        Project TwoPhaseDeployment =new Project("Two Phase Deployment", "Deployment", "Viktor Novakovic");
        Project Delta = new Project("Delta Model", "Login", "Viktor Novakovic");
        Project Beta = new Project("Beta Enhancement", "Authentication", "Kristijan Peric");
        Project CustomerOnboarding = new Project("Customer Onboarding", "Ads", "Viktor Novakovic");
        Project Verification = new Project("Source Verification", "Data", "Pablo");

        employees.add(new Employee("2020Emp3134", "Jovan", "Jovanovic", 3000,  Arrays.asList(Delta, Beta)));
        employees.add(new Employee("2012Emp9323", "Petar", "Simic", 1750, Arrays.asList(Pegasus, CustomerOnboarding, Beta, SiteReliability)));
        employees.add(new Employee("2017Emp721", "Marko", "Smiljkovic", 400, Arrays.asList(FactorAuthentication, Beta, CommonUI)));
        employees.add(new Employee("2017Emp2023", "Ana", "Milosevic", 1800, Arrays.asList(Delta, FactorAuthentication)));
        employees.add(new Employee("2013Emp0001", "Katarina", "Djordjevic", 520,  Arrays.asList(Pegasus, Delta, RemoveUsers, DataTransition)));
        employees.add(new Employee("2022Emp0087", "Jovan", "Simic", 10000,  Arrays.asList(FactorAuthentication)));
        employees.add(new Employee("2019Emp0050", "Predrag", "Milosavljevic", 737,  Arrays.asList(RemoveUsers, CommonUI)));
        employees.add(new Employee("2023Emp0934", "Jelena", "Jovanovic", 1145,  Arrays.asList(Pegasus)));
        employees.add(new Employee("2023Emp1033", "Novak", "Novak", 623,  Arrays.asList(Delta)));
        employees.add(new Employee("2015Emp0009", "Dusan", "Marjanovic", 2600, Arrays.asList(Verification, RemoveUsers, TwoPhaseDeployment)));
    }

    public List<Employee> getAllEmployee(){

        return employees;
    }
}
