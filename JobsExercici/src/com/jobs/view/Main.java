package com.jobs.view;

import com.jobs.application.JobsController;


public class Main {
    private static JobsController controller = new JobsController();

    public static void main(String[] args)
    {
        try
        {
            controller.createBossEmployee("Pepe Boss", "Address 1", "611111111" , 100) ;
            controller.createManagerEmployee("Pedro Manager", "Address 2", "622222222", 100);
            controller.createEmployee("Pepe Employee", "Address 6", "622222222", 100);
            controller.createEmployee("Laura Employee", "Address 3", "633333333", 100);
            controller.createVolunteer("Juan Volunteer", "Address 4", "644444444", "Motivado");

            controller.payAllEmployees();

            String allEmployees = controller.getAllEmployees();
            String listaSalarios = controller.getAllEmployeesSalaries();

            String listaEmpleados = controller.getAllTypeEmployee();
            String listaVoluntarios = controller.getAllTypeVolunteer();

            System.out.println("EMPLOYEES: " + allEmployees);
            System.out.println("SALARIOS : " + listaSalarios);
            System.out.println("Empleados : " + listaEmpleados);
            System.out.println("Voluntarios : " + listaVoluntarios);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}