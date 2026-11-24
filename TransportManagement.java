class TransportManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Transport t = null;

        int choice;

        do
        {
            System.out.println("\n---- TRANSPORT MANAGEMENT SYSTEM ----");
            System.out.println("1. City Bus Booking");
            System.out.println("2. Luxury Bus Booking");
            System.out.println("3. Calculate Fare");
            System.out.println("4. Display Ticket");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                case 2:

                    if(choice == 1)
                        t = new CityBus();
                    else
                        t = new LuxuryBus();

                    System.out.print("Enter Passenger ID: ");
                    t.passengerId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    t.passengerName = sc.nextLine();

                    t.fromCity = "Chennai";

                    System.out.println("\nSelect Route:");
                    System.out.println("1. Chennai -> Bangalore");
                    System.out.println("2. Chennai -> Coimbatore");
                    System.out.println("3. Chennai -> Madurai");
                    System.out.println("4. Chennai -> Trichy");
                    System.out.println("5. Chennai -> Salem");

                    System.out.print("Enter route choice: ");
                    int route = sc.nextInt();

                    switch(route)
                    {
                        case 1:
                            t.toCity = "Bangalore";
                            t.distance = 350;
                            break;

                        case 2:
                            t.toCity = "Coimbatore";
                            t.distance = 500;
                            break;

                        case 3:
                            t.toCity = "Madurai";
                            t.distance = 460;
                            break;

                        case 4:
                            t.toCity = "Trichy";
                            t.distance = 330;
                            break;

                        case 5:
                            t.toCity = "Salem";
                            t.distance = 340;
                            break;

                        default:
                            System.out.println("Invalid Route!");
                            t = null;
                            break;
                    }

                    if(t != null)
                        System.out.println("Ticket Booked Successfully");

                    break;

                case 3:

                    if(t != null)
                    {
                        t.calculateFare();
                        System.out.println("Fare Calculated Successfully");
                    }
                    else
                    {
                        System.out.println("Please Book a Ticket First!");
                    }

                    break;

                case 4:

                    if(t != null)
                        t.displayTicket();
                    else
                        System.out.println("No Ticket Available!");

                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}