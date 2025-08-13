import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Huffman
{
    private enum action {COMPRESS, DECOMPRESS}

    public Huffman(String[] args)
    {
        String action = checkInput(args);
        switch (action)
        {
            case "COMPRESS":
                compress();
                break;

            case "DECOMPRESS":
                decompress();
                break;

            default:
                System.err.println("Invalid action");
                break;
        }

        // TODO: change called values here
        printResult(771502, 442582);

    }

    public static void main(String[] args)
    {
        Huffman h = new Huffman(args);

        System.exit(0);
    }

    public String checkInput(String[] args)
    {
        if (args.length != 3)
        {
            System.err.println("Usage: java Huffman " +
                    "<action> <input file> <output file>");
            System.exit(1);
        }

        String action = args[0];
        if (!(action.equals("compress") || action.equals("decompress")))
        {
            System.err.println("Error: Action must be 'compress' " +
                    "or 'decompress'.");
            System.exit(1);
        }

        String fInputPath = args[1];
        BufferedReader input = null;
        try
        {
            input = new BufferedReader(new FileReader(fInputPath));
        } catch (FileNotFoundException e)
        {
            System.err.println("Error: File '" + fInputPath + "' not found.");
            System.exit(1);
        }

        return action.toUpperCase();
    }

    private String compress()
    {
        //
        return null;
    }

    private String decompress()
    {
        //
        return null;
    }

    private void printResult(int ogSize, int compSize)
    {
        // TODO: revisit the variables
        double spaceSaved = ogSize / compSize;

        StringBuilder sb = new StringBuilder();
        sb.append("Original file size:   ");
        sb.append(ogSize);
        sb.append(" bytes"); // TODO: change this to a variable
        sb.append(System.lineSeparator());
        sb.append("Compressed file size: ");
        sb.append(compSize);
        sb.append(" bytes"); // TODO: change this to a variable
        sb.append(System.lineSeparator());
        sb.append("Space saving:         ");
        sb.append(spaceSaved);
        sb.append("%");
        sb.append(System.lineSeparator());

        System.out.println(sb);
    }


}
