package gr.parisk85.visitor;

public class DefaultVisitor implements Visitor {
    @Override
    public void visit(XmAccountId xmAccountId) {
        System.out.println(xmAccountId.getProfileId());
    }

    @Override
    public void visit(UsCustomerId usCustomerId) {
        System.out.println(usCustomerId.toString());
    }
}
