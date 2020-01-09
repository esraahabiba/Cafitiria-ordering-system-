/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Observable;
import java.util.*;

/**
 *
 * @author laban
 */
public class Test {

    static Scanner scan;

    public static void main(String[] args) throws InterruptedException ,NullPointerException{

        DAOFactory factory = DAOFactory.getDAOFactory();

        //=============================== Customer DAO ==============================================
        CustomerDAO customerDAO = factory.getCustomerDAO();
        int customerId = 9 ;
        Customer customer1 = new Customer(customerId++, "Ali", "123456", "ali@abc.xyz", "Alex");
        Customer customer2 = new Customer(customerId++, "Bahera", "654321", "bosy@abc.xyz", "Cairo");
        boolean res = customerDAO.insertCustomer(customer1);
        System.out.println(res ? "Custromer1 inserted successfully" : "Error inserting Customer1");
        res = customerDAO.insertCustomer(customer2);
        System.out.println(res ? "Customer2 inserted successfully" : "Error inserting Customer2");

        Customer retCustomer = customerDAO.getCustomerById(3);
        System.out.println("GetCustomerById: " + retCustomer);

        List<Customer> customers = customerDAO.getAllCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        //=============================== Order DAO ==============================================
        OrderDAO orderDAO = factory.getOrderDAO();
       int customerIdv = 10;
        int orderId = 2 ; 
     Date de =new Date(15/12/2008);
     Date de2 =new Date(15/12/2008);
        Order order1 = new Order(orderId++,de, 45.26, "Cash");
       Order order2 = new Order(orderId++, de2, 400.0, "Cash");

        boolean res2 = orderDAO.insertOrder(order1);
        System.out.println(res2 ? "order1 inserted successfully" : "Error inserting order1");
     res2 = orderDAO.insertOrder(order2);
        System.out.println(res2 ? "order2 inserted successfully" : "Error inserting order2");

        Order retOrder = orderDAO.getOrderById(1);
        System.out.println("GetOrderById: " + retOrder);

        List<Order> orders = orderDAO.getAllOrders();
        for (Order order : orders) {
            System.out.println(order);
        }

        //=============================== Manager DAO ==============================================
        ManagerDAO managerDAO = factory.getManagerDAO();

        Manager manager1 = Manager.getInstance();
        
        manager1.setName("ALI");
        manager1.setPhone("010125694");
        manager1.setMail("AVUW@ABC.ZYZ");
        manager1.setAddress("ALEX");
        //    Manager manager2 = Manager.getInstance.("Ali", "123456", "ali@abc.xyz","Alex");		

       //boolean res3 = managerDAO.insertManager(manager1);
       // System.out.println(res3 ? "manager1 inserted successfully" : "Error inserting Manager1");

        Manager retManager = managerDAO.getManagerById(1);
        System.out.println("GetManagerById: " + retManager);

        scan = new Scanner(System.in);
       // Order order = new Order();
        OrderContext context = new OrderContext();
        String input = scan.nextLine();
        if (!input.equalsIgnoreCase("Cancel")) {
            context.Ordered(order1);
            //input = scan.nextLine();
        }
        
        
      ItemBuilder itmbuilder = null;
      ItemMaker itemmaker = new ItemMaker(itmbuilder);
        itemmaker.buildItem();
        Item item = new Item();
        item = itmbuilder.getItem();
        String iteminf = item.toString();
        System.out.println(iteminf);
        
        
       // Item item =new Item();
        item.id=1;
        item.name="pizza";
        item.description="pizza";
        item.price=100;
        item.size="small";
        Menu nu = new MiniMenu();
        nu.Add(item);
        MiniMenu sun = new MiniMenu();
        Observable OBS = new Observable();
        sun.update(OBS, item);
        String des = nu.Operation(item);
        System.out.println(des + " " + item.name);

        System.out.println("Enter Payment Method ");
        if(scan.next()=="Cash"){
        PaymentMethod py = new Cash();
        py.pay(order1.getTotalPrice());
        }
//        else{
//        PaymentMethod CR = new CreditCard(des, des, des, "pizza");
//        }
        Controller myController = new Controller();
        model myModel = new model();
        Component myView = new Component();
        myController.addModel(myModel);
        myController.addView(myView);

    }
}
