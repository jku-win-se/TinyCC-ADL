# TinyCC Architecture Description Language

TinyCC is a simple architectural description language (ADL) for system engineers. The TinyCC model consists of hierarchical sets of components and connectors. Components have input or output ports, determined by the value of the dir property (defined by the FlowDir enumeration). Connectors provide two or more connector ends, allowing the creation of a hierarchical network of components and connectors. Components, connectors, ends, and ports are all model elements that can be extended with user-defined properties. Each property can hold a type and a value.

In TinyCC, architectural models can be combined with simulation models, such as functional mock-up units (FMUs). To facilitate this combination, an abstract metaclass called SimElement is introduced. It provides a file-based mapping mechanism for components and connectors through the simModelPath property.
The complete metamodel is shown in the figure below.

![image](https://github.com/jku-win-se/TinyCC-ADL/assets/925612/ebe8e427-74ba-4c14-af38-19aa5589345f)
