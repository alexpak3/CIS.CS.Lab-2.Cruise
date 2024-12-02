public class Actor {
    private String  actorName;
    private String  actorRole;

    public Actor(String actorName, String actorRole) {
        this.actorRole= actorRole;
        this.actorName = actorName;
    }

    public void setName(String name) {
        this.actorName = name;
    }

    public String getName() {
        return actorName;
    }

    public void setRole(String role) {
        this.actorRole = role;
    }

    public String getRole() {
        return actorRole;
    }

    @Override
    public String toString() {
        return
                "actorName='" + actorName +
                ", actorRole='" + actorRole + '\n'
                ;
    }
}

