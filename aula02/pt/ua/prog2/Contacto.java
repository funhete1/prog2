package pt.ua.prog2;

public class Contacto {
  private String nome; //Store the name of the contact
  private String telefone; //Store the number of the contact
  private String eMail;    //Store the mail of the contact


  public Contacto(String _nome, String _telefone){
    nome = _nome;
    telefone = _telefone;
  }
  public Contacto(String _nome,String _telefone, String _mail){
    nome = _nome;
    telefone = _telefone;
    eMail = _mail;
  }
  public String nome(){return nome;}
  public String telefone(){return telefone;}
  public String eMail(){return eMail;}




}
