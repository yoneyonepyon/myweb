package myweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EntryList {

	private ArrayList<EntryItem> items;

	public EntryList() {
		items = new ArrayList<EntryItem>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/dbmag?characterEncoding=UTF-8&serverTimezone=JST",
					"root",
					"Mysql@2019");

			Statement st = con.createStatement();
			ResultSet res = st.executeQuery("SELECT * FROM member");

			while(res.next()) {
				String mid = res.getString("mid");
				String nam = res.getString("nam");
				String birth = res.getString("birth");
				int sex = res.getInt("sex");

				EntryItem item = new EntryItem(mid, nam, birth, sex);
				items.add(item);
			}

			res.close();
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<EntryItem> getItems() {
		return items;
	}

	public static void main(String[] args) {
		EntryList list = new EntryList();

		for (int i = 0; i < list.items.size(); i++) {
			EntryItem item = list.items.get(i);
			System.out.println(item);
		}
	}

}
