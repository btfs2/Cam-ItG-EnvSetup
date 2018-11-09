#version 130 // Shader version

// Inputs to shader pipeline (frag shader can't have own inputs IIRC)
in vec3 v_ver;
in vec2 v_tex;
in vec3 v_nor;

// Outputs to frag shader
out vec2 f_tex;
out vec3 f_nor;

uniform mat4 u_matrix;

void main(void) {
	f_tex = v_tex;
	f_nor = v_nor;

	gl_Position = u_matrix * vec4(v_ver, 1.0);
}
