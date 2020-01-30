# Basic-Javacord-Command-Parser

## Setup in IntelliJ

1. [Download](https://github.com/Ramit110/Basic-Javacord-Command-Script/releases) the release, this is the same as the zipped file, source code or tar.gz based on your preferences.
2. Unzip/extract the file into a location (one that you've already initialised git in if you want to add it to an existing repository).
3. Open IntelliJ and import an existing project and navigate to the file you extracted the zip to.
4. Select import from an external model and select Gradle. Select next.
5. Select the options you want and press Finish.

## Using the project

1. Navigate to ``com.javacord.bot`` and create a new Java file.
2. Make a ``Secrets.java`` file and add a ``String BotID``.
3. Make a new java file and have the class extend ``CommandBase``.
4. Implement the ``public String run()`` method.
5. Go to command parser and go to the switch in ``public CommandParser()`` and add 
```
  switch "<command>":
    command = <new_class>;
    break;
```
