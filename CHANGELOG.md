# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Calendar Versioning](https://calver.org/) of
the following form: YYYY.0M.0D.

## [2026.02.05]

### Added

- Designed a `Triangle` component.
- Designed a `Data Table` component.
- Designed a `Projectile` component.

## [2026.03.10]

### Added

- Designed kernel and enhanced interfaces for `Triangle` component.

### Updated

- Minor changes to `TriangleProofOfConcept`.

## [2026.03.31]

### Added

- Created `TriangleSecondary` abstract class implementing interface `Triangle`.

### Updated

- Added `Triangle twoDimensionRepresentation()` to interface `Triangle`.

## [2026.04.06]

### Added

- Finished Code for the `twoDimensionRepresentation()` method in `TriangleSecondary`.

### Updated

- Changed return type of `twoDimensionRepresentation()` from `Triangle` to `double[]` to avoid needing a constructor yet.
- Fixed issues with methods that previously used `twoDimensionRepresentation()` in their implementation.
- Changed implementation of `edgeLength()` to not require `twoDimensionRepresentation()` in its implementation.
- Changed implementation of `twoDimensionRepresentation()` to use `edgeLength`.

## [2026.04.14]

### Added

- Added `equals()` method to `TriangleSecondary` abstract class.
- Added `hashCode()` method to `TriangleSecondary` abstract class.
- Designed kernel implementation for `Triangle1` component.
