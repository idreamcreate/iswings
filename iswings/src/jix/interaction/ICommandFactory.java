package jix.interaction;

public interface ICommandFactory {
	public ICommandProcessor getCommandProcessor();
	public ICommand getCommand(Object rawData);
}
