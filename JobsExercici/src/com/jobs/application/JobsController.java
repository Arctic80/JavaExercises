package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


public class JobsController
{
    private EmployeeRepository employeeRepository;

    public JobsController()
    {
        employeeRepository = new EmployeeRepository();
    }

    public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
    {
        BigDecimal salarioMensual = new BigDecimal(salaryPerMonth).setScale(1, RoundingMode.HALF_EVEN);

        Employee boss = new Employee(name, address, phone, salarioMensual, PaymentFactory.createPaymentRateBoss());
        employeeRepository.addMember(boss);
    }

    public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
    {
        BigDecimal salarioMensual = new BigDecimal(salaryPerMonth).setScale(1, RoundingMode.HALF_EVEN);;

        Employee manager = new Employee(name, address, phone, salarioMensual, PaymentFactory.createPaymentRateManager());
        employeeRepository.addMember(manager);
    }

    public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception
    {
        BigDecimal salarioMensual = new BigDecimal(salaryPerMonth).setScale(1, RoundingMode.HALF_EVEN);

        Employee employee = new Employee(name, address, phone, salarioMensual, PaymentFactory.createPaymentRateEmployee());
        employeeRepository.addMember(employee);
    }

    public void createVolunteer(String name, String address, String phone, String description) throws Exception
    {
        Volunteer volunteer = new Volunteer(name, address, phone, description);
        employeeRepository.addMember(volunteer);
    }

    public void payAllEmployees()
    {
        for (AbsStaffMember member : employeeRepository.getAllMembers()) member.pay();
    }

    public String getAllEmployees()
    {
        ArrayList<String> listMembers = new ArrayList<>();

        for (AbsStaffMember member : employeeRepository.getAllMembers()) listMembers.add(member.getName());

        return listMembers.toString();
    }

    public String getAllEmployeesSalaries()
    {
        ArrayList<BigDecimal> listSalaries = new ArrayList<>();

        for (AbsStaffMember member : employeeRepository.getAllMembers()) listSalaries.add(member.getTotalPaid());

        return listSalaries.toString();
    }

    public String getAllTypeEmployee()
    {
        ArrayList<String> listEmployees = new ArrayList<>();

        for (AbsStaffMember member : employeeRepository.getAllMembers())
            if (member instanceof Employee) listEmployees.add(member.getName());

        return listEmployees.toString();
    }

    public String getAllTypeVolunteer()
    {
        ArrayList<String> listVolunteers = new ArrayList<>();

        for (AbsStaffMember member : employeeRepository.getAllMembers())
            if (member instanceof Volunteer) listVolunteers.add(member.getName());

        return listVolunteers.toString();
    }

}