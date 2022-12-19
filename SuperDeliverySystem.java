/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdeliverysystem;

/**
 *
 * @author aseer
 */

public class SuperDeliverySystem {
    static LoginPage_1 LoginPage_1 = new LoginPage_1();
//    static Register_2 register = new Register_2(); 
//       static AdminHomePage_2 adminHomePage = new AdminHomePage_2(); 
//    static Admin_ViewAllAccounts_3 Admin_ViewAllAccounts_3 = new Admin_ViewAllAccounts_3();
//    static Admin_ViewAllBenefiter_3 Admin_ViewAllBenefiter_3 = new Admin_ViewAllBenefiter_3();
//    static Admin_ViewAllProviders_3 Admin_ViewAllProviders_3 = new Admin_ViewAllProviders_3();
//    static Admin_ViewAllServices_3 Admin_ViewAllServices_3 = new Admin_ViewAllServices_3();
//    static Admin_ViewRegisterationRequests_3 Admin_ViewRegisterationRequests_3 = new Admin_ViewRegisterationRequests_3();
//    static BenefiterHomePage_2 BenefiterHomePage_2 = new BenefiterHomePage_2();
//    static DoYouOwnAVehicle_3 DoYouOwnAVehicle_3 = new DoYouOwnAVehicle_3();
//    static ProviderHomePage_2 ProviderHomePage_2 = new ProviderHomePage_2();
//    static VehicleRegisteration_4 VehicleRegisteration_4 = new VehicleRegisteration_4();
//    static Admin_ViewRequestedOrders_3 Admin_ViewRequestedOrders_3 = new Admin_ViewRequestedOrders_3();
//    static Admin_ViewPlacedServices_3 Admin_ViewPlacedServices_3 = new Admin_ViewPlacedServices_3();
//    static Admin_ViewCarriedOutOrders_3 Admin_ViewCarriedOutOrders_3 = new Admin_ViewCarriedOutOrders_3();
//    static Admin_ViewFeedbackMessages_3 Admin_ViewFeedbackMessages_3 = new Admin_ViewFeedbackMessages_3();
//    static Tablebviewall1  tableviewall1=new Tablebviewall1();
//    static SelectedID1 selectedID1=new SelectedID1();
     
    
    static NewOrder neworder = new NewOrder();
    //connection class to enable connectiong the database "sds"
    static connectionClass connection;

    public static void main(String[] args) {
        LoginPage_1.setVisible(true);
        connectionClass.getConnection();
    }

}
