# HederaService Project

This project is a Java Spring Boot application that interacts with the Hedera Hashgraph network. It provides functionalities such as transferring HBARs, associating tokens, creating accounts, and checking account balances.

## Services

### `HederaService`

This service provides the following methods:

- `multipleTransfer(TranferResponseDto tranferResponseDto)`: This method allows for transferring HBARs from one account to multiple accounts.

- `multipleAssociate(AssociateResponseDto associateResponseDto)`: This method allows for associating multiple tokens to multiple accounts.

- `multipleCreateAccount(CreateAccountDto createAccountDto)`: This method allows for creating multiple accounts.

- `checkBalance(CheckBalanceDto checkBalanceDto)`: This method allows for checking the balance of an account.

## DTOs

The project uses several DTOs (Data Transfer Objects) to encapsulate the data and send it from one subsystem of an application to another. Here are some of them:

- `TranferResponseDto`: Used in the `multipleTransfer` method.

- `AssociateResponseDto`: Used in the `multipleAssociate` method.

- `CreateAccountDto`: Used in the `multipleCreateAccount` method.

- `CheckBalanceDto`: Used in the `checkBalance` method.

## Usage

To use this service, you need to create an instance of the respective DTOs and pass them to the methods. The DTOs contain all the necessary information such as account addresses, private keys, token IDs, and other required details.

## Dependencies

This service uses the Hedera Hashgraph SDK for Java.

## Note

Please ensure that you have the necessary permissions and credits in your Hedera account to perform these operations.

## Build and Run

This project uses Maven for dependency management. To build the project, navigate to the project directory and run the following command:

```bash
mvn clean install
