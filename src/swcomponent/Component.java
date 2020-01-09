/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

import swcomponent.componenthandle;
import java.awt.Font;
import java.util.Observable;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author gt
 */
public class Component extends Application implements java.util.Observer{

    @Override
    public void start(Stage primaryStage) {
        GridPane homepane = new GridPane();
        homepane.setAlignment(Pos.CENTER);
        homepane.setHgap(9);
        homepane.setVgap(90);
        Scene homescene = new Scene(homepane, 600, 600);
        Button userlogin = new Button();
        userlogin.setText(" Log In As A User ");
        Button managerlogin = new Button();
        managerlogin.setText(" Log In As A Manager ");
        Button signup = new Button();
        signup.setText(" sign up ");
        Label titlelabel = new Label();
        titlelabel.setText("Cafeteria Ordering System (COS)");
        Label label1 = new Label();
        label1.setText("i am not a user ");
        homepane.add(userlogin, 1, 1);
        homepane.add(managerlogin, 3, 1);
        homepane.add(titlelabel, 2, 0);
        homepane.add(signup, 3, 4);
        homepane.add(label1, 2, 4);
        userlogin.setOnAction(new componenthandle());
        managerlogin.setOnAction(new componenthandle());
        signup.setOnAction(new componenthandle());
        primaryStage.setTitle("HOME WINDOW");
        primaryStage.setScene(homescene);
        primaryStage.show();
        //////////////////////////////////////////////////////////////////////////////////////
        Stage userstage = new Stage();
        GridPane userpane = new GridPane();
        Scene userscene = new Scene(userpane, 600, 600);
        userpane.setAlignment(Pos.CENTER);
        userpane.setHgap(9);
        userpane.setVgap(30);
        Button menuview = new Button();
        menuview.setText(" View Our Menu ");
        Button historyview = new Button();
        historyview.setText(" View Your History ");
        Button traceorder = new Button();
        traceorder.setText(" Trace Your Order ");
        Button back = new Button();
        back.setText(" go back ");
        Label label = new Label();
        label.setText("Cafeteria Ordering System (COS)");
        userpane.add(menuview, 1, 2);
        userpane.add(historyview, 1, 3);
        userpane.add(traceorder, 1, 4);
        userpane.add(back, 0, 6);
        userpane.add(label, 1, 0);
        userstage.setTitle("USER OPTIONS");
        userstage.setScene(userscene);
        userstage.show();
        ////////////////////////////////////////////////////////////////////////////////////
        Stage menustage = new Stage();
        GridPane menupane = new GridPane();
        Scene menuscene = new Scene(menupane, 600, 600);
        menupane.setAlignment(Pos.CENTER);
        menupane.setHgap(9);
        menupane.setVgap(30);
        Button next = new Button();
        next.setText(" next ");
        Button add = new Button();
        add.setText(" add item ");
        Button delete = new Button();
        delete.setText(" delete item ");
        Button back2 = new Button();
        back2.setText(" go back ");
        Label labe2 = new Label();
        labe2.setText("Cafeteria Ordering System (COS)");
        TextField price = new TextField();
        price.setEditable(false);
        TextField totalpric = new TextField();
        totalpric.setEditable(false);
        Label totalprice = new Label();
        totalprice.setText("Total Price = ");
        ObservableList<String> options = FXCollections.observableArrayList(
                "Option 1",
                "Option 2",
                "Option 3"
        );
        ComboBox menucomboBox = new ComboBox(options);

        menupane.add(back2, 0, 7);
        menupane.add(labe2, 1, 0);
        menupane.add(next, 4, 7);
        menupane.add(add, 4, 2);
        menupane.add(delete, 4, 3);
        menupane.add(price, 1, 2);
        menupane.add(totalprice, 0, 3);
        menupane.add(totalpric, 1, 3);
        menupane.add(menucomboBox, 0, 2);
        menustage.setTitle("OUR MENU");
        menustage.setScene(menuscene);
        menustage.show();
////////////////////////////////////////////////////////////////////////

        Stage aproveorderstage = new Stage();
        GridPane aproveorderpane = new GridPane();
        Scene aproveorderscene = new Scene(aproveorderpane, 600, 600);
        aproveorderpane.setAlignment(Pos.CENTER);
        aproveorderpane.setHgap(9);
        aproveorderpane.setVgap(30);

        Button back3 = new Button();
        back3.setText(" go back ");
        Label label3 = new Label();
        label3.setText("Cafeteria Ordering System (COS)");
        Button payment = new Button();
        payment.setText(" Payment ");
        aproveorderpane.add(back3, 0, 7);
        aproveorderpane.add(label3, 1, 0);
        aproveorderpane.add(payment, 4, 7);
        aproveorderstage.setTitle("Your Order");
        aproveorderstage.setScene(aproveorderscene);
        aproveorderstage.show();

        //////////////////////////////////////////////////////////////////////////////
        Stage paymentstage = new Stage();
        GridPane paymentpane = new GridPane();
        Scene paymentscene = new Scene(paymentpane, 600, 600);
        paymentpane.setAlignment(Pos.CENTER);
        paymentpane.setHgap(9);
        paymentpane.setVgap(30);

        Button back4 = new Button();
        back4.setText(" go back ");
        Label label4 = new Label();
        label4.setText("Cafeteria Ordering System (COS)");

        Label select = new Label();
        select.setText("Select Your Payment Method");

        CheckBox creditcard = new CheckBox(" Credit Card ");
        creditcard.setIndeterminate(false);

        CheckBox cache = new CheckBox(" Cache ");
        cache.setIndeterminate(false);

        Button checkout = new Button();
        checkout.setText("check out");

        paymentpane.add(back4, 0, 7);
        paymentpane.add(label4, 1, 0);
        paymentpane.add(select, 1, 2);
        paymentpane.add(checkout, 4, 7);
        paymentpane.add(creditcard, 1, 3);
        paymentpane.add(cache, 1, 4);

        paymentstage.setTitle("CHECK OUT YOUR ORDER");
        paymentstage.setScene(paymentscene);
        paymentstage.show();

        ///////////////////////////////////////////////////////////
        Stage historystage = new Stage();
        GridPane historypane = new GridPane();
        Scene historyscene = new Scene(historypane, 600, 600);
        historypane.setAlignment(Pos.CENTER);
        historypane.setHgap(9);
        historypane.setVgap(30);

        Button back5 = new Button();
        back5.setText(" go back ");
        Label label5 = new Label();
        label5.setText("Cafeteria Ordering System (COS)");

        Label history = new Label();
        history.setText("Your Order History ");

        historypane.add(label5, 1, 0);
        historypane.add(back5, 0, 7);
        historypane.add(history, 1, 1);
        historystage.setTitle("YOUR HISTORY");
        historystage.setScene(historyscene);
        historystage.show();

        ///////////////////////////////////////////////////////////////////////////////////////
        Stage managerstage = new Stage();
        GridPane managerpane = new GridPane();
        Scene managerscene = new Scene(managerpane, 600, 600);
        managerpane.setAlignment(Pos.CENTER);
        managerpane.setHgap(9);
        managerpane.setVgap(30);
        Button usemenu = new Button();
        usemenu.setText(" Use The Menu ");
        Button generatereport = new Button();
        generatereport.setText(" Generate A Report ");
        Button back6 = new Button();
        back6.setText(" go back ");
        Label label6 = new Label();
        label6.setText("Cafeteria Ordering System (COS)");

        managerpane.add(generatereport, 1, 3);
        managerpane.add(usemenu, 1, 4);
        managerpane.add(back6, 0, 6);
        managerpane.add(label6, 1, 0);
        managerstage.setTitle("MANAGER OPTIONS");
        managerstage.setScene(managerscene);
        managerstage.show();

        ///////////////////////////////////////////////////////////////
        
        Stage reportstage = new Stage();
        GridPane reportpane = new GridPane();
        Scene reportscene = new Scene(reportpane, 600, 600);
        reportpane.setAlignment(Pos.CENTER);
        reportpane.setHgap(9);
        reportpane.setVgap(30);
        
       Button back7 = new Button();
        back7.setText(" go back ");
         reportpane.add(back7, 0, 6);
        reportstage.setTitle("MANAGER REPORT");
        reportstage.setScene(reportscene);
        reportstage.show();
        
        
        
        ///////////////////////////////////////////
        Stage usemenustage = new Stage();
        GridPane usemenupane = new GridPane();
        Scene usemenuscene = new Scene(usemenupane, 600, 600);
        usemenupane.setAlignment(Pos.CENTER);
        usemenupane.setHgap(9);
        usemenupane.setVgap(30);
        
        Button manageradditem = new Button();
        manageradditem.setText(" Add Item ");
       
        Button managerdeleteitem = new Button();
        managerdeleteitem.setText(" Delete Item ");
        
         Button managerupdateitem = new Button();
        managerupdateitem.setText(" Update Item  ");
        
        usemenupane.add(manageradditem, 1, 1);
        usemenupane.add(managerdeleteitem, 1, 2);
        usemenupane.add(managerupdateitem, 1, 3);
         Button back8 = new Button();
        back8.setText(" go back ");
         usemenupane.add(back8, 0, 6);
        usemenustage.setTitle("MANAGER VIEW");
        usemenustage.setScene(usemenuscene);
        usemenustage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void update(Observable o, Object o1) {
        System.out.println("there is some Update");
    }
}
