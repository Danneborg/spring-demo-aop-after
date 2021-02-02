package kononikhin.DAO;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {

    public boolean addMemberShipAccount() {
        System.out.println(getClass() + ". Adding account to a membership dao");
        return true;
    }

    public String print(boolean t){
        System.out.println("Sleep");
        return ";";
    }
}
