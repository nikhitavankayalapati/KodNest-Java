package track.Practice_Sessions;

import java.util.Scanner;

class SupportTicket {
    int id;
    int priority;
    int waitingMinutes;
}

public class SupportTicketReferenceSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create and fill the first ticket
        SupportTicket st1 = new SupportTicket();
        st1.id = sc.nextInt();
        st1.priority = sc.nextInt();
        st1.waitingMinutes = sc.nextInt();

        // Create and fill the second ticket
        SupportTicket st2 = new SupportTicket();
        st2.id = sc.nextInt();
        st2.priority = sc.nextInt();
        st2.waitingMinutes = sc.nextInt();

        // Create and fill the third ticket
        SupportTicket st3 = new SupportTicket();
        st3.id = sc.nextInt();
        st3.priority = sc.nextInt();
        st3.waitingMinutes = sc.nextInt();

        // Initially select the first ticket
        SupportTicket st = st1;

        // Compare the second ticket using the ordered rules
        if ((st.priority < st2.priority) ||
                (st.priority == st2.priority && st.waitingMinutes < st2.waitingMinutes) ||
                (st.priority == st2.priority &&
                        st.waitingMinutes == st2.waitingMinutes &&
                        st.id > st2.id)) {

            st = st2;
        }

        // Compare the third ticket with the current selection
        if ((st.priority < st3.priority) ||
                (st.priority == st3.priority && st.waitingMinutes < st3.waitingMinutes) ||
                (st.priority == st3.priority &&
                        st.waitingMinutes == st3.waitingMinutes &&
                        st.id > st3.id)) {

            st = st3;
        }

        // Print the selected object's fields
        System.out.println("Selected Ticket: " + st.id);
        System.out.println("Priority: " + st.priority);
        System.out.println("Waiting Minutes: " + st.waitingMinutes);

        sc.close();
    }
}