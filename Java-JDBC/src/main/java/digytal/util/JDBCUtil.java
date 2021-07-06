package digytal.util;

import java.util.Collections;

public class JDBCUtil {
	//https://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string
	public static String insertUpdate(TipoOperacao tipo, String table, String ... fields) {
		if(tipo==TipoOperacao.INSERT)
			return insert(table, fields);
		else if(tipo==TipoOperacao.UPDATE)
			return update(table, fields);
		return "NÃO IMPLEMENTADO";
	}
	public static String insert(String table, String ... fields) {
		StringBuilder sb = new StringBuilder("INSERT INTO " + table + " ");
		sb.append(String.join(", ", fields));
		sb.append(" VALUES (");
		sb.append(String.join(", ", Collections.nCopies(fields.length, "?")));
		sb.append(");");
		//PODERIA REFATORAR PARA UM StringFormat DE BOAS
		return sb.toString();
	}
	//https://www.baeldung.com/java-string-joiner
	public static String update(String table, String ... fields) {
		/*
		StringJoiner set = new StringJoiner(",", "", " = ?");
		set.add(String.join("= ?, ", fields));
	    StringBuilder sb = new StringBuilder(String.format("UPDATE %s SET ", table));
		
		sb.append(set.toString());
		*/
		
		String campos = String.join("= ?, ", fields) +" =?;";
		StringBuilder sb = new StringBuilder(String.format("UPDATE %s SET %s ", table, campos));
		
		return sb.toString();
		//return sb.toString();
	}
	public static String delete(String table, String fieldId) {
		return String.format("DELETE * FROM %s WHERE %s = ?", table, fieldId );
	}
	public static String select(String table, String fieldId, String ... fields) {
		return String.format("SELECT * FROM %s WHERE %s = ?", table, fieldId );
	}
	public static String select(String table) {
		return String.format("SELECT * FROM %s", table);
	}
	//TESTES UNITARIOS
	public static void main(String[] args) {
		String tabela = "tab_cadastro";
		String campos []= {"codigo","nome","telefone","aniversario"};
		
		System.out.println(update(tabela, campos));
		/*
		String insert = insert(tabela, campos);
		
		System.out.println(insert);
		
		String update = update(tabela, campos);
		System.out.println(update);
		
		String delete = delete(tabela, "codigo");
		System.out.println(delete);
		*/
	}
}
