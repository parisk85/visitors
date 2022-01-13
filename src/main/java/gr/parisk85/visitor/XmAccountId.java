package gr.parisk85.visitor;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class XmAccountId implements AccountId {

    long profileId;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
