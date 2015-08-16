package DBConnection;


import java.sql.*;

public class Connect {
    static final  String USERNAME="root";
    static final String PASSWORD="root";
    static final String URL="jdbc:mysql://localhost:3306/kit";
    private Connection connection=null;
    private PreparedStatement statement=null;

    public Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
           }
        catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /*добавление нового студента*/
    public void addStudent(String name,String sername,String group)  {
        try {
          statement=connection.prepareStatement("INSERT  INTO student(name, sername, `group`) VALUES (?,?,?)");
          statement.setString(1,name);
          statement.setString(2,sername);
          statement.setString(3,group);
          statement.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /*получить всех студентов*/
    public ResultSet getAllSudents(){
        ResultSet result=null;
        try {
         statement=connection.prepareStatement("SELECT * FROM student");
           result=statement.executeQuery();
        }catch (SQLException e){

        }

return  result;
    }

    /*получить всех студентов определенной группы*/
    public ResultSet getAllStudentsInGroup(String  groupName){
        ResultSet result = null;
        try{
            statement=connection.prepareStatement("SELECT * FROM student WHERE `group`=?");
            statement.setString(1,groupName);
            result=statement.executeQuery();
        }catch (SQLException e){

        }
        return  result;
    }

/*удалить всех студентов*/
    public void deleteAllStudents(){
        try {
            statement=connection.prepareStatement("DELETE FROM student");
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*обновить информацию о студенте по ID*/
    public void updateStudent(String oldname,String oldsername,String oldgroup,String newname,String newsername,String newgroup){

        try{
            statement=connection.prepareStatement("UPDATE student SET name=?,sername=?,`group`=? WHERE name=? AND sername=? AND `group`=?");
            statement.setString(1,newname);
            statement.setString(2,newsername);
            statement.setString(3,newgroup);
            statement.setString(4,oldname);
            statement.setString(5,oldsername);
            statement.setString(6,oldgroup);
           statement.execute();
        }catch (SQLException e){

        }
    }




}
