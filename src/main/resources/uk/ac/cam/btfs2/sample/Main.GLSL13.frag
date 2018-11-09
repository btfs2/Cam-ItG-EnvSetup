#version 130

in vec2 f_tex;
in vec2 f_nor;

uniform sampler2D u_tex;

out vec4 o_col;

void main(void) {
	o_col = vec4(1.0,1.0,1.0,1.0);//texture(u_tex, f_tex);
}
