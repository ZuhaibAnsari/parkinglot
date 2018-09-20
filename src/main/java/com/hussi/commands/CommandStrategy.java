package com.hussi.commands;

import com.hussi.enums.CommandsEnum;

public interface CommandStrategy
{
	void execute(String[] parameters);
}
