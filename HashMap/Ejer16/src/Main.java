import java.util.*;

class GroupManager {
    Map<String, List<String>> groups = new HashMap<>();

    boolean addUserToGroup(String user, String group) {
        groups.putIfAbsent(group, new ArrayList<>());
        if (groups.get(group).contains(user)) {
            return false;
        }
        groups.get(group).add(user);
        return true;
    }

    boolean removeUserFromGroup(String user, String group){
        if (!groups.containsKey(group) || !groups.get(group).contains(user)){
            return false;
        }
        groups.get(group).remove(user);
        return true;
    }

    boolean deleteGroup (String group) {
            if (!groups.containsKey(group)){
                return false;
            }
            groups.remove(group);
            return true;
    }

    Set<String> getGroups (){
        return new HashSet<>(groups.keySet());
    }

    Set<String> getUsers (String group){
        if (!groups.containsKey(group)) return new HashSet<>();
        return new HashSet<>(groups.get(group));
    }

}
public class Main {
    public static void main(String[] args) {
        GroupManager grupos = new GroupManager();
        System.out.println(grupos.addUserToGroup("Paco", "Patxingars")); //true
        System.out.println(grupos.addUserToGroup("Fran", "Patxingars")); //true
        System.out.println(grupos.addUserToGroup("Juan", "Patxingars")); //true
        System.out.println(grupos.removeUserFromGroup("Iñaki", "Patxingars")); //false
        System.out.println(grupos.removeUserFromGroup("Paco", "Pachingars")); //false
        System.out.println(grupos.removeUserFromGroup("Paco", "Patxingars")); //true
        System.out.println(grupos.addUserToGroup("Kalista", "Lol")); //true
        System.out.println(grupos.deleteGroup("Lol")); //true
        System.out.print(grupos.getGroups() + "  ");
        System.out.println();
        System.out.print(grupos.getUsers("Patxingars") + " ");


    }
}