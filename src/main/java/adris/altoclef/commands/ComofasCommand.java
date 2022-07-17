package adris.altoclef.commands;

import adris.altoclef.AltoClef;
import adris.altoclef.Debug;
import adris.altoclef.Playground;
import adris.altoclef.commandsystem.Arg;
import adris.altoclef.commandsystem.ArgParser;
import adris.altoclef.commandsystem.Command;
import adris.altoclef.commandsystem.CommandException;
import adris.altoclef.tasks.construction.PlaceSignTask;


public class ComofasCommand extends Command {

    private String text;

    public ComofasCommand() throws CommandException {
        super("comofas", "eai comofas", new Arg(String.class, "extra", "Eai comofas", 0));
    }

    @Override
    protected void call(AltoClef mod, ArgParser parser) throws CommandException {
        text = parser.get(String.class);
        mod.runUserTask(new PlaceSignTask(text));
        Debug.logMessage("acabou o comando comofas");
        finish();
    }
}
