# Krew-Profit-Calculator
An executable to calculate profit taking into account the cargo characteristics like space that occupies, price to buy in an island and to sell at another. And with those, calculate the profit. The first version will have the hardcoded values like islands, prices and distance/time that it takes from an island to another. V2 will use the API to get those info.

## How to use on console

**1. Create a new calculator object with an optional level of detail**
   - Default level of detail set as core
  
     `Calculator calc = new Calculator();`
   - Especifying from header, core or detailed
  
     `Calculator calc = new Calculator(LevelOfDetail.DETAILED);`
     
**2. Choose from one of the three options**

&nbsp;&nbsp;&nbsp;&nbsp;`displayNumber` is an optional varargs that represents how many options the user wants to be shown. Default is set as 3. If more than one &nbsp;&nbsp;&nbsp;&nbsp;option is presented, only the first will be used.

   - Show the best options of what and where to sell from the current island
   
     ```
     List<ProfitOption> options = calc.
        calculateSellRoutesFromCurrentIsland(String currentIslandName, String shipName, int... displayNumber);
     ```
   - Show the best cargo to sell from island A to B
     ```
     List<ProfitOption> options = calc.
        calculateBestCargosFromCurrentToTargetIsland(String currentIslandName, String sellIslandName, String shipName, int... displayNumber);
     ```
   - Show the best profit routes from all islands to the current island the most profitable route will have a better chance of encountering a player to attack
   
     *Obs: Default oponnent's ship set as trader 1.*
   
     ```
     List<ProfitOption> options = calc.
        calculateRoutesToAttackFromCurrentIsland(String currentIslandName, int... displayNumber);
     ```
**3. Print resulting list**

  - Print with `LevelOfDetail.HEADER`
    ```
    Calculator calc = new Calculator(LevelOfDetail.HEADER);
    List<ProfitOption> options = calc.calculateRoutesToAttackFromCurrentIsland("labrador");
    System.out.println(options);
    ```
    Output: 
    ```
    [
    Phillipines(Gems) -> Labrador
    Trader 1
    , 
    Spain(Gems) -> Labrador
    Trader 1
    , 
    Guinea(Gems) -> Labrador
    Trader 1
    ]
    ```
  - Print with `LevelOfDetail.CORE`
    ```
    Calculator calc = new Calculator();
    List<ProfitOption> options = calc.calculateSellRoutesFromCurrentIsland("spain", "trader 1", 5);
    System.out.println(options);
    ```
    Output: 
    ```
    [
    Spain(Gems) -> Labrador
    Trader 1
      Profit To Be Made: $83k
            Travel Time: 2m29s
      Profit per Second: $557/s
    , 
    Spain(Bananas) -> Malaysia
    Trader 1
      Profit To Be Made: $92k
            Travel Time: 5m47s
      Profit per Second: $265/s
    , 
    Spain(Gems) -> Cuba
    Trader 1
      Profit To Be Made: $63k
            Travel Time: 4m2s
      Profit per Second: $260/s
    , 
    Spain(Bananas) -> Phillipines
    Trader 1
      Profit To Be Made: $36k
            Travel Time: 2m31s
      Profit per Second: $238/s
    , 
    Spain(Bananas) -> Guinea
    Trader 1
      Profit To Be Made: $56k
            Travel Time: 4m27s
      Profit per Second: $210/s
    ]
    ```
  - Print with `LevelOfDetail.DETAILED`
    ```
    Calculator calc = new Calculator(LevelOfDetail.DETAILED);
    List<ProfitOption> options = calc.calculateBestCargosFromCurrentToTargetIsland("malaysia", "brazil", "trader 2", 2);
    System.out.println(options);
    ```
    Output:
    ```
    [
    Malaysia(Spice) -> Brazil
    Trader 2
      Profit To Be Made: $56k
            Travel Time: 3m8s
      Profit per Second: $299/s
     Ship's max storage: 6000 slots
           Ship's speed: 5.0 in game speed units
        Travel distance: 145m
        Cargo buy price: $135/unit
       Cargo sell price: $8/unit
        Cargo unit size: 8 slots/unit
            Total spent: $101k
             Total sold: $157k
           Units bought: 750 units
    , 
    Malaysia(Coffee) -> Brazil
    Trader 2
      Profit To Be Made: $36k
            Travel Time: 3m8s
      Profit per Second: $191/s
     Ship's max storage: 6000 slots
           Ship's speed: 5.0 in game speed units
        Travel distance: 145m
        Cargo buy price: $95/unit
       Cargo sell price: $5/unit
        Cargo unit size: 5 slots/unit
            Total spent: $114k
             Total sold: $150k
           Units bought: 1200 units
    ]
    ```
