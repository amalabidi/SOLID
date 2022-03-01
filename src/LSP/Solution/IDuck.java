package LSP.Solution;

public interface IDuck
{
    void quack() throws IDuckException;

    void swim() throws IDuckException;

    class IDuckException extends Exception
    {
        public IDuckException(String message)
        {
            super(message);
        }
    }
}
