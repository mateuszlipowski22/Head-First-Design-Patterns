package head_first_desing_patterns.section_11_proxy.remote_proxy;

import java.io.Serializable;

public interface State extends Serializable {
    void insertCoin();
    void returnCoin();
    void turnTheKnob();
    void givingGum();
}
