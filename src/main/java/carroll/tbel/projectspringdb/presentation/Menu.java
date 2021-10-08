package carroll.tbel.projectspringdb.presentation;

import carroll.tbel.projectspringdb.annotation.Impl;
import carroll.tbel.projectspringdb.exceptions.ElementAlreadyPresentException;
import carroll.tbel.projectspringdb.exceptions.ElementNotFoundException;
import carroll.tbel.projectspringdb.metier.dto.ConsoleDTO;
import carroll.tbel.projectspringdb.metier.dto.EditorDTO;
import carroll.tbel.projectspringdb.metier.dto.GameDTO;
import carroll.tbel.projectspringdb.metier.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
@Impl
//@Profile("project")
public class Menu {

    @Autowired
    private GameService gameService;
    @Autowired
    private ConsoleService consoleService;
    @Autowired
    private EditorService editorService;

    @Autowired
    private Scanner sc;

    public Menu(ConsoleService consoleService, EditorService editorService) {
        this.consoleService = consoleService;
        this.editorService = editorService;
    }

    //Start app
    public void start() throws ElementAlreadyPresentException {

        int choice;
        do {
            displayMenu();
            choice = Integer.parseInt( sc.nextLine() );
            mapChoice(choice);
        }while ( choice != 4);

    }

    //Display Menu
    private void displayMenu() {
        System.out.println("--- MAIN MENU ---");
        System.out.println("1 - See All");
        System.out.println("2 - Add");
        System.out.println("3 - Delete");
        System.out.println("4 - Quit");
    }

    //Map Choices
    private void mapChoice(int choice) throws ElementAlreadyPresentException {
        switch (choice) {
            case 1 -> displayAll();
            case 2 -> add();
            case 3 -> delete();
            case 4 -> quit();
            default -> System.out.println("Invalid choice");
        }
    }

    //Quitting
    private void quit() {
        System.out.println("Goodbye!");
    }

    //Show all
    private void displayAll() {
        gameService.getAll().forEach(System.out::println);
    }

    //Add information
    private void add() throws ElementAlreadyPresentException {

        int tabChoice;
        do {
            displayTabMenu();
            tabChoice = Integer.parseInt(sc.nextLine() );
            mapTabChoice(tabChoice);
        }while (tabChoice != 4);
    }

    //Display the menu for adding to tables
    private void displayTabMenu() {
        System.out.println("Adding to tables Menu");

        System.out.println("Choose a table to add information into");
        System.out.println("1 - Add to 'Console' ");
        System.out.println("2 - Add to 'Editor' ");
        System.out.println("3 - Add to 'Game' ");
        System.out.println("4 - Back to Menu");
    }

    //Map of choices for adding to tables
    private void mapTabChoice(int tabChoice) throws ElementAlreadyPresentException {

         gameService.getAll().forEach(System.out::println);

            switch (tabChoice) {
                case 1 -> addToConsole();
                case 2 -> addToEditor();
                case 3 -> addToGame();
                case 4 -> backToMenu();
                default -> System.out.println("Invalid choice.");
            }
    }

    //Methods for adding to tables
    private void backToMenu() {
        System.out.println("Going back to Menu");
    }

    private void addToConsole() throws ElementAlreadyPresentException {
        ConsoleDTO.ConsoleDTOBuilder builder = ConsoleDTO.builder();

        System.out.println("Name of brand : ");
        builder.brand(sc.nextLine() );
        System.out.println("Name of model : ");
        builder.model(sc.nextLine() );
        System.out.println("Name of manufacturer : ");
        builder.manufacturer(sc.nextLine() );

        consoleService.add( builder.build() );

        System.out.println("Added information successfully");
    }

    private void addToEditor() {
        EditorDTO.EditorDTOBuilder builder = EditorDTO.builder();

        System.out.println("Name of editor : ");
        builder.name(sc.nextLine() );

        try {
            editorService.add( builder.build() );
        } catch (ElementAlreadyPresentException e) {
            e.printStackTrace();
        }

        System.out.println("Added information successfully");

    }

    private void addToGame() {
        GameDTO.GameDTOBuilder builder = GameDTO.builder();

        System.out.println("Name of game : ");
        builder.name(sc.nextLine() );
        System.out.println("Price of game : ");
        builder.price(sc.nextDouble() );
        System.out.println("Pegi rating : ");
        builder.pegi(sc.nextInt() );

        try {
            gameService.add( builder.build() );
        } catch (ElementAlreadyPresentException e) {
            e.printStackTrace();
        }

        System.out.println("Added information successfully");
    }

    //Delete information
    private void delete() {
        System.out.println("Please enter the name of the game you wish to delete");
        String gameName = sc.nextLine();

        try {
            gameService.delete(gameName);
            System.out.println("The game has been deleted");
        }catch (ElementNotFoundException e){
            System.out.println( e.getMessage() );
        }

    }

}

/* List<Editor> editors = List.of();
            List<Editor> editors = editors.stream()
                    .filter(element ->element.startsWith("a"))
                    .collect(Collectors.toList());
            */