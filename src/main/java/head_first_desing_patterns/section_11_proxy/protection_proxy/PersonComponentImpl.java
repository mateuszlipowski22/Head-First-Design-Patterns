package head_first_desing_patterns.section_11_proxy.protection_proxy;

public class PersonComponentImpl implements PersonComponent{
    String name;
    String sex;
    String interests;
    int ranking;
    int rankingNumber=0;

    public PersonComponentImpl(String name, String sex, String interests) {
        this.name = name;
        this.sex = sex;
        this.interests = interests;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public int getBeautyRanking() {
        return (rankingNumber==0) ? 0 : ranking/rankingNumber;

    }

    @Override
    public void setBeautyRanking(int ranking) {
        this.ranking += ranking;
        this.rankingNumber++;
    }
}
