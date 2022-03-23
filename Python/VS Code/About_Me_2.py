

while True:
    print("Options are:")
    print("")
    try:
        option = int(input("Please enter an option: "))
        if option == -1:
            break
        elif option !=1 and option !=2 and option != 3:
            print("Please  enter a valid option.")
        else:
            print("Thank you for a valid option")
            if option == 1:
                print("")
            elif option == 2:
                print("")
            elif option == 3:
                print("")



    except ValueError:
        print("Please enter a valid input")
    