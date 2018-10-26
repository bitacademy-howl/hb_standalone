import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SimpleJDBC {
	static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/webdb?useSSL=false&serverTimezone=UTC";
	
	Connection conn;
	String user = "root";
	String pw = "stark1234!";
	
	public SimpleJDBC() {
//		registerDriver();
	}

//	private void registerDriver() {
//		try {
//			Class.forName(DRIVER_NAME);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public void getMusicInfo(String column) {
		try {
			if (column==null) {
				column = "Music_title";
			}
			
			System.out.println("################################ start init #######################################################");
			this.conn = DriverManager.getConnection(DB_URL, user, pw);
			
			//ssssssss외부함수(conn); 이렇게 하면 
//			{
			
			StringBuilder sb = new StringBuilder();
			sb.append("select * from Music_table where ");
			sb.append(column);
			sb.append(" like ?;");
			
			String query = sb.toString(); 

			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, "%편지%");
			
			System.out.println(ps);
			
			ResultSet rs = ps.executeQuery();
			
			MusicVO mvo = new MusicVO();
			
			while(rs.next()){
				mvo.setMusicID(rs.getInt("Music_ID"));
				mvo.setMusicTitle(rs.getString("Music_Title"));
				mvo.setMusicNode(rs.getString("Music_Node"));
				mvo.setLyrics(rs.getString("Lyrics"));
				
				System.out.println(mvo);
			}
			
			rs.close();
			ps.close();
			
			//}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (this.conn != null) {
				try {
					this.conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
