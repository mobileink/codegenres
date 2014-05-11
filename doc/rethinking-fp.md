# Rethinking Functional Programming

Reconceptualization, not redoing.  This is not about an innovation in
functional programming, but about thinking in different ways about the
same thing.

The basic idea: think in terms of algebras (signatures and structures)
instead of functions.

Instead of test cases, theorems.  E.g. think of a clojure.test case
like `(= (+ 1 1) 2)` not as a piece of client code that tests the
function `+`, but as a theorem in the theory of the structure
consisting of both `+` and the numbers.

Signatures generate formulae (sentences) that express theorems about
structures.  Example: `2 + 2 = 4` as a theorem.  It's not really
"about" `+` alone, but about the entire structure of which `+` is a
part.  This generates an infinite number of theorems of this form (one
for each input pair), which together form the theory of the structure.
You can prove a finite set of theorems using the case method, by
demonstrating every possibility.  But you can't prove an infinite set
of theorems extensionally (by writing them all down), so instead you
have to prove the method implied by `+`, which means writing down an
_inductive_ proof.  You can do this in a formal proof system, but not
in Clojure (or most other functional languages).  So you have to
settle for partial proof-by-cases and hope that your cases cover all
execution paths.

The result is not essentially different from what unit testing already
does.  The difference is a shift in conceptualization: instead of
thinking in terms of testing of functions, we think in terms of
proving theorems about structures.  We start with the general, ideal
situation (genuine complete proofs about structures) and move down to
max possible (finite quasi-proof, by cases), rather that starting at
the bottom (application of function to specific args) and throwing
together an ad-hoc collection of function test cases without a general
picture of how this relates to structures and proofs.

# Function Specification

Currently: minimal requirement is signature and implementation.

But what is the ideal?  Tentatively:

* Type signature - function and arg names and types
* Specification - defines criteria of semantic (pragmatic) correctness
* Theorems - otherwise known as test cases.  These serve two purposes:
  * Provide evidence that the code is correct
  * Demonstration of semantics ("semantics by cases", like "proof by cases")
* Definition - i.e. implementing code
* Documentation
  * Minimal technical - ideally, not needed since the type signature
    and semantic specification should completely characterize the
    function.
  * Pedagogical - in many cases we can anticipate a need for some
    additional commentary, such as examples demonstrating the intended
    use of the code, etc.

> Note the order: the type sig, semantic spec, and theorems tell us
> what the function means, regardless of how it is implemented;
> together they express criteria of correctness that must be satisfied
> by any implementation.  The documentation is informal, extrinsic
> add-on stuff


# Code organization

Taking Clojure as example.  Function signature and implementation, and
docstring, go in the same file; tests usually (but not necessarily) go
in a separate file.  If we also had support for formal specifications,
as well as for structured documentation, there are several options:

* Everthing in one file.  The monolithic approach recommended by Knuthian Literate Programming.
* Everything in its own file: code, specification, tests/theories, docs
* Code and specification in one file, tests (theories) and docs in another
* Code and specification in one file, tests (theories) in another, docs in a third


