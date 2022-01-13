package gr.parisk85.visitor;

public class Main {

    public static void main(String[] args) {
        XmAccountId xmAccountId = XmAccountId.builder()
                .profileId(1234)
                .build();

        UsCustomerId usCustomerId = UsCustomerId.builder()
                .accountId(4321)
                .customerType("LEAD")
                .build();

        DefaultVisitor visitor = new DefaultVisitor();
        xmAccountId.accept(visitor);
        usCustomerId.accept(visitor);
    }
}
