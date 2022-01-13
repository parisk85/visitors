package gr.parisk85.visitor;

import lombok.Builder;
import lombok.ToString;
import lombok.Value;

@Value
@Builder
@ToString
public class UsCustomerId implements AccountId {

    long accountId;
    String customerType;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
