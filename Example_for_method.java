class Theater{
public static void main(String[]asd){
Theater ajai=new Theater();
int balance=ajai.bookticket(200);
System.out.println("After booking ticket"+" "+balance);
}
int bookticket(int amount){
int ticket_price=120;
int balance=amount-ticket_price;
return balance;
}
}
