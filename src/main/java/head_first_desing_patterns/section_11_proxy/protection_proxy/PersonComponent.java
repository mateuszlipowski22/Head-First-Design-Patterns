package head_first_desing_patterns.section_11_proxy.protection_proxy;

public interface PersonComponent {

    String getName();
    String getSex();
    String getInterests();
    int getBeautyRanking();

    void setName(String name);
    void setSex(String sex);
    void setInterests(String interests);
    void setBeautyRanking(int ranking);
}
