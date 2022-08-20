package com.example.demo;
import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		Task1 t1 =new Task1( "Recordar POO",  false, LocalDate.of( 2022,  8,  19));
		Task1 t2 =new Task1( "Conocer Intelliij",  false, LocalDate.of( 2022,  8,  19));
		Task1 t3 =new Task1( "Conocer Spring boot",  false, LocalDate.of( 2022,  8,  19));
		Task1 t4 =new Task1( "Finalizando tareas",  false, LocalDate.of( 2022,  8,  19));
		Task1 t5 =new Task1( "Recuperar finalizado tareas",  false, LocalDate.of( 2022,  8, 19));

		/*System.out.println("descripcion de la tarea:");
		System.out.println(t1.getDescription());
		System.out.println("fecha de la tarea:");
		System.out.println(t1.getDueDate());
		System.out.println("estado de la tarea realizada?");
		System.out.println(t1.getDone());*/

		TaskList1  metas=new TaskList1("Tareas iniciales");

		metas.addTaskList(t1);
		metas.addTaskList(t2);
		metas.addTaskList(t3);
		metas.addTaskList(t4);
		metas.addTaskList(t5);

		//System.out.println("Tareas iniciales");
		//metas.printTasks();

		metas.removeTask("Recordar POO");
		System.out.println("Tareas pendientes:");
		metas.printTasks();
	}



}
