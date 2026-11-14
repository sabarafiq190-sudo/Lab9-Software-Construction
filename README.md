# Lab 9 - Software Maintenance

**Course:** Software Construction, 5th Semester Software Engineering
**University:** UET Abbottabad Campus

## Task 1: Refactoring Legacy Code
`ReportManager` refactored to remove 4 code smells:
- String concatenation loop replaced with `String.join`
- Null check added for `type`
- PDF/CSV if-else replaced with `ReportFormatter` interface (`PdfFormatter`, `CsvFormatter`)
- Static `EmailClient` replaced with `Notifier` interface injected via constructor

## Task 2: Fail-Fast Immutable Model
`BankTransfer` record with guard clauses (`Objects.requireNonNull` and a strictly positive amount check).

## Task 3: Structured Tracing (MDC simulation)
`PaymentProcessor.charge()` prints `[TraceID: ...]` and clears context in a `finally` block.

## Task 4: JUnit 5 Quality Gate
`OrderServiceTest` follows Arrange-Act-Assert and tests `OrderService` with a fake `VipDiscount`.

## How to Run
Requirements: JDK 17+, Maven, NetBeans.

1. Open the project in NetBeans.
2. Right-click `Task1Main`, `Task2Main` or `Task3Main` and choose **Run File**.
3. Right-click `OrderServiceTest` and choose **Test File**, or run `mvn test`.
