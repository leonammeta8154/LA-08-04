package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface InterfaceProduto extends Remote {
    public void setId(int id) throws RemoteException;
    public void setDescricao(String descricao) throws RemoteException;
    public void setPreco(double preco) throws RemoteException;
    public void setQuantidade(int quantidade) throws RemoteException;
    public int getId() throws RemoteException;
    public String getDescricao() throws RemoteException;
    public double getPreco() throws RemoteException;
    public int getQuantidade() throws RemoteException;
    public void insert() throws RemoteException;
    public ArrayList<InterfaceProduto> select() throws RemoteException;
    public void delete(int id) throws RemoteException;
}
